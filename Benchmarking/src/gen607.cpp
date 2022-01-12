  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v2 = v0[1];
    const std::vector<std::vector<double>> v12 = v2.p1;
    const std::vector<std::vector<double>> v16 = v2.p0;
    const s0 v43 = v0[1];
    s0 v20 = v2;
    const std::vector<std::vector<double>> v54 = v2.p0;
    const std::vector<std::vector<double>> v34 = v2.p1;
    v20.p0 = v16;
    v20.p1 = v12;
    const std::vector<std::vector<double>> v40 = v20.p1;
    v20.p1 = v34;
    std::vector<std::vector<double>> v48 = v40;
    v20.p0 = v54;
    const std::vector<std::vector<double>> v30 = v43.p1;
    v20.p1 = v30;
    const std::vector<std::vector<double>> v64 = v43.p1;
    const std::vector<std::vector<double>> v42 = v20.p1;
    v20.p1 = v42;
    const std::vector<double> v83 = v48[0];
    v20.p0 = v16;
    v20.p1 = v64;
    const double v88 = v83[0];
    v20.p1 = v48;
    return v88;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } });
    double v1(6.0);
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
