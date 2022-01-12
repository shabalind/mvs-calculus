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
    const s0 v5 = v0[0];
    double v3 = v1;
    v3 = v1;
    const std::vector<std::vector<double>> v9 = v5.p1;
    const std::vector<double> v14 = v9[1];
    const std::vector<double> v25 = v9[0];
    std::vector<std::vector<double>> v8 = v9;
    v8[0] = v14;
    std::vector<double> v30 = v25;
    const std::vector<std::vector<double>> v24 = v5.p0;
    v8[0] = v25;
    const std::vector<double> v27 = v8[1];
    const double v35 = v30[0];
    const std::vector<double> v42 = v24[0];
    v30 = v42;
    const std::vector<std::vector<double>> v36 { v30, v27, v27, v14, v42, v14 };
    const double v29 = v27[0];
    std::vector<std::vector<double>> v72 = v36;
    const std::vector<double> v63 = v36[5];
    const std::vector<double> v48 = v72[1];
    v8[0] = v48;
    const std::vector<double> v178 { v3, v35, v29 };
    v72[5] = v63;
    std::vector<double> v96 = v178;
    const double v64 = v96[1];
    return v64;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } });
    double v1(4.0);
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
