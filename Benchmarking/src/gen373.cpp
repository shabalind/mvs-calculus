  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<std::vector<double>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<double>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    double v4 = v1;
    std::vector<std::vector<double>> v14 = v5;
    const std::vector<double> v3 = v5[0];
    v14[0] = v3;
    v14[0] = v3;
    std::vector<std::vector<double>> v10 = v5;
    const std::vector<double> v19 = v14[0];
    const std::vector<std::vector<double>> v13 = v0.p0;
    const double v18 = v1 - v1;
    const double v20 = v19[0];
    const std::vector<double> v17 = v10[0];
    v10[0] = v17;
    const std::vector<double> v44 = v10[0];
    v10[0] = v3;
    v10[0] = v17;
    const std::vector<double> v25 = v13[0];
    v14[0] = v25;
    std::vector<double> v26 = v44;
    const double v32 = v44[0];
    v14[0] = v25;
    v26[0] = v4;
    const double v40 = v17[0];
    v14[0] = v17;
    double v34 = v32;
    v26[0] = v34;
    v14[0] = v26;
    const double v149 = v3[0];
    const double v52 = v19[0];
    const std::vector<double> v228 { v40, v18, v149, v34, v52 };
    v26[0] = v20;
    const double v188 = v228[4];
    return v188;
  }
  int main() {
    s1 v0({ { { 0.0 } }, { { { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } } }, { { { 7.0 }, { 8.0 }, { 9.0 } } } } });
    double v1(10.0);
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
