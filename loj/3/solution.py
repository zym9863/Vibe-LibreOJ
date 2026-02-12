def main() -> None:
    try:
        with open("copycat.in", "r", encoding="utf-8") as fin:
            tokens = fin.read().split()
    except FileNotFoundError:
        with open("copycat.out", "w", encoding="utf-8") as fout:
            fout.write("")
        return

    if not tokens:
        with open("copycat.out", "w", encoding="utf-8") as fout:
            fout.write("")
        return

    t = int(tokens[0])
    values = tokens[1 : 1 + t]

    with open("copycat.out", "w", encoding="utf-8") as fout:
        fout.write("\n".join(values))


if __name__ == "__main__":
    main()

