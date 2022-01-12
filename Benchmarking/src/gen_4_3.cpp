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
    const s0 v6 = v0[2];
    const std::vector<std::vector<double>> v7 = v6.p0;
    const std::vector<std::vector<double>> v10 = v6.p0;
    std::vector<std::vector<double>> v2 = v7;
    const std::vector<double> v9 = v2[0];
    v2[2] = v9;
    const double v59 = v9[0];
    const double v36 = v1 * v59;
    const double v34 = v36 * v36;
    const std::vector<double> v62 = v10[2];
    double v70 = v34;
    v2[1] = v62;
    const double v68 = v34 * v70;
    v2 = v10;
    return v68;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    double v1(15.0);
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
