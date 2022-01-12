  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    s0 v3 = v0;
    v3.p0 = v1;
    double v10 = v1;
    v3.p0 = v10;
    s0 v6 = v3;
    const double v13 = v3.p0;
    v6.p0 = v13;
    double v11 = v10;
    s0 v27 = v6;
    v3.p0 = v11;
    const double v33 = v6.p0;
    s0 v16 = v27;
    v16.p0 = v11;
    s0 v66 = v16;
    v66.p0 = v33;
    const double v89 = v66.p0;
    v27.p0 = v33;
    return v89;
  }
  int main() {
    s0 v0({ 0.0, { { 1.0 }, { 2.0 } } });
    double v1(3.0);
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
