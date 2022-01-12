  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s2 {
    double p0;
    s2(double v0): p0(v0) { }
  };
  s2 f48(const s2 &v0) {
    s2 v3 = v0;
    s2 v5 = v0;
    s2 v6 = v5;
    s2 v13 = v3;
    const double v11 = v6.p0;
    v13.p0 = v11;
    v5.p0 = v11;
    s2 v7 = v13;
    s2 v26 = v7;
    return v26;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s2 v7 = f48(v0);
    const double v5 = v0.p0;
    s2 v12 = v0;
    double v6 = v1;
    v12.p0 = v5;
    double v10 = v6;
    v12.p0 = v1;
    const double v27 = v0.p0;
    v10 = v27;
    v12.p0 = v10;
    const double v51 = v7.p0;
    v12.p0 = v51;
    const s2 v61 = f48(v12);
    v12.p0 = v51;
    const double v166 = v61.p0;
    return v166;
  }
  int main() {
    s2 v0({ 0.0 });
    double v1(1.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
