def solution(sizes):
    sizes = [sorted(size) for size in sizes]

    widths = [size[0] for size in sizes]
    height = [size[1] for size in sizes]

    answer = max(widths) * max(height)

    return answer
