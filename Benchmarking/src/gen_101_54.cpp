  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f29(const s0 &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v4 = v0[2];
    const s0 v7 = f29(v4);
    const s0 v5 = v0[1];
    const std::vector<std::vector<double>> v12 = v7.p1;
    const std::vector<double> v8 = v12[2];
    const double v11 = v8[0];
    const double v26 = v8[0];
    s0 v50 = v5;
    const std::vector<std::vector<double>> v36 = v50.p1;
    const std::vector<std::vector<double>> v24 = v7.p1;
    std::vector<double> v27 = v8;
    const s0 v43 = f29(v50);
    const double v25 = v27[0];
    const double v37 = v43.p0;
    v27[0] = v11;
    v50.p1 = v24;
    const double v38 = v27[0];
    v50.p0 = v25;
    const std::vector<std::vector<double>> v112 = v43.p1;
    v27[0] = v26;
    v50.p1 = v36;
    v50.p0 = v38;
    v50.p1 = v112;
    return v37;
  }
  int main() {
    std::vector<s0> v0({ { 0.0, { { 1.0 }, { 2.0 }, { 3.0 } } }, { 4.0, { { 5.0 }, { 6.0 }, { 7.0 } } }, { 8.0, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    double v1(12.0);
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
