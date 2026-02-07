// @ts-check
import { defineConfig } from 'astro/config';

// https://astro.build/config
const isGitHubPages = process.env.DEPLOY_TARGET === 'github';

export default defineConfig({
  site: isGitHubPages ? 'https://zym9863.github.io' : undefined,
  base: isGitHubPages ? '/Vibe-LibreOJ' : undefined,
});
