import glob
from collections import defaultdict
import numpy as np
import matplotlib.pyplot as plt

benchmarks = ['bounce', 'mandelbrot', 'nbody', 'permute', 'queens']
languages = ['swift', 'cpp', 'scala', 'mvs']
colors = {'swift': 'blue', 'scala': 'orange', 'mvs': 'green', 'cpp': 'red'}
labels = {'swift': 'Swift', 'scala': 'Scala', 'mvs': 'Swiftlet', 'cpp': 'C++'}

samples = defaultdict(lambda: defaultdict(lambda: dict))

for bench in benchmarks:
  for lang in languages:
    bench_samples = []
    for file in glob.glob(f"Benchmarking/{lang}/results/{bench}.*"):
      with open(file) as f:
        bench_samples.extend(map(int, f.readlines()))
    samples[bench][lang] = np.array(bench_samples, dtype=float)

normalized_samples = defaultdict(lambda: defaultdict(lambda: dict))

for bench in benchmarks:
  baseline = np.percentile(samples[bench]['swift'], 50)
  for lang in languages:
    normalized_samples[bench][lang] = samples[bench][lang] / baseline

x = np.arange(len(benchmarks))  # the label locations
width = 0.35 / 2  # the width of the bars

fig, ax = plt.subplots()
rects = []
n = len(languages)
for i, lang in enumerate(languages):
  means = [np.percentile(normalized_samples[bench][lang], 50) for bench in benchmarks]
  rect = ax.bar(x - width * i + width + width / 2, means, width, label=labels[lang], color=colors[lang])
  rects.append(rect)

# Add some text for labels, title and custom x-axis tick labels, etc.
#ax.set_ylabel('Normalized running time')
#ax.set_title('Scores by group and gender')
ax.set_xticks(x, labels=benchmarks)
ax.legend()
ax.set_yscale('log')
ax.set_ylim([0, 13])

for rect in rects:
  ax.bar_label(rect, padding=3, rotation=90, fmt="%0.2f x", color='gray')

fig.tight_layout()

plt.savefig('arewefastyet.pdf')
