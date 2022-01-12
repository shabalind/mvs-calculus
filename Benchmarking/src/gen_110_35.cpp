  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v8 = v0[0];
    const std::vector<s0> v9 = v8.p1;
    const s0 v10 = v9[0];
    const s0 v11 = v9[0];
    const s0 v14 = v9[0];
    s0 v21 = v11;
    const std::vector<std::vector<double>> v17 = v10.p0;
    v21.p0 = v17;
    const std::vector<std::vector<double>> v24 = v14.p0;
    const std::vector<double> v49 = v24[2];
    std::vector<double> v31 = v49;
    const std::vector<std::vector<double>> v54 = v21.p1;
    const std::vector<double> v36 = v17[2];
    const std::vector<double> v57 = v54[0];
    const std::vector<std::vector<double>> v164 { v31, v31, v49, v31, v57, v36 };
    const std::vector<double> v104 = v164[0];
    const double v169 = v104[0];
    return v169;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } } });
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
