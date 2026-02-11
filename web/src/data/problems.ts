import fs from 'node:fs';
import path from 'node:path';

export interface Problem {
  id: number;
  title: string;
  url: string;
  solutions: Record<string, string>;
}

const LANG_MAP: Record<string, string> = {
  'solution.c': 'C',
  'solution.cpp': 'C++',
  'solution.cs': 'C#',
  'solution.fs': 'F#',
  'solution.py': 'Python',
  'solution.java': 'Java',
  'solution.kt': 'Kotlin',
  'solution.pas': 'Pascal',
  'solution.rs': 'Rust',
  'solution.go': 'Go',
  'solution.hs': 'Haskell',
};

const LOJ_DIR = path.resolve(import.meta.dirname, '../../..', 'loj');

function extractProblemTitle(content: string, id: number): string {
  const normalized = content.replace(/\r\n?/g, '\n').replace(/^\uFEFF/, '');
  const headingMatch = normalized.match(/^\s{0,3}#{1,6}\s+(.+)$/m);

  let title = headingMatch?.[1] ?? '';
  if (!title) {
    const fallbackLine = normalized
      .split('\n')
      .map((line) => line.trim())
      .find((line) => line && !/^url[:\uFF1A]/i.test(line) && !/^https?:\/\//i.test(line));
    title = fallbackLine ?? '';
  }

  title = title
    .replace(/^#+\s*/, '')
    .replace(/\[(.*?)\]\([^)]*\)/g, '$1')
    .replace(/[`*_~]/g, '')
    .replace(new RegExp(`^#?\\s*0*${id}\\s+`), '')
    .replace(/^\s*[-:\uFF1A]+\s*/, '')
    .trim();

  return title;
}

function extractProblemUrl(content: string, fallbackUrl: string): string {
  const normalized = content.replace(/^\uFEFF/, '');
  const urlMatch = normalized.match(/https?:\/\/loj\.ac\/p\/\d+/);
  return urlMatch?.[0] ?? fallbackUrl;
}

export function getProblems(): Problem[] {
  if (!fs.existsSync(LOJ_DIR)) return [];

  const dirs = fs.readdirSync(LOJ_DIR).filter((d) => {
    const full = path.join(LOJ_DIR, d);
    return fs.statSync(full).isDirectory() && /^\d+$/.test(d);
  });

  return dirs
    .map((dir) => {
      const dirPath = path.join(LOJ_DIR, dir);
      const problemPath = path.join(dirPath, 'problem.md');

      const fallbackTitle = `Problem ${dir}`;
      let title = fallbackTitle;
      let url = `https://loj.ac/p/${dir}`;

      if (fs.existsSync(problemPath)) {
        const content = fs.readFileSync(problemPath, 'utf-8');
        const extractedTitle = extractProblemTitle(content, Number(dir));
        title = extractedTitle || fallbackTitle;
        url = extractProblemUrl(content, url);
      }

      const solutions: Record<string, string> = {};
      for (const [file, lang] of Object.entries(LANG_MAP)) {
        const filePath = path.join(dirPath, file);
        if (fs.existsSync(filePath)) {
          solutions[lang] = fs.readFileSync(filePath, 'utf-8');
        }
      }

      return { id: Number(dir), title, url, solutions };
    })
    .sort((a, b) => a.id - b.id);
}

export const SUPPORTED_LANGUAGES = [
  { name: 'C', color: '#555555' },
  { name: 'C++', color: '#f34b7d' },
  { name: 'C#', color: '#239120' },
  { name: 'F#', color: '#378bba' },
  { name: 'Python', color: '#3572a5' },
  { name: 'Java', color: '#b07219' },
  { name: 'Kotlin', color: '#a97bff' },
  { name: 'Pascal', color: '#e3f171' },
  { name: 'Rust', color: '#dea584' },
  { name: 'Go', color: '#00add8' },
  { name: 'Haskell', color: '#5e5086' },
];
