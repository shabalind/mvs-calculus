  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    double v4 = v1;
    std::vector<s1> v6 = v0;
    const s1 v7 = v0[0];
    const s1 v3 = v6[0];
    const s0 v2 = v3.p1;
    const std::vector<std::vector<double>> v15 = v2.p0;
    const double v36 = v4 + v1;
    v6[0] = v7;
    v6[0] = v3;
    const std::vector<double> v35 = v15[0];
    v6[0] = v7;
    const std::vector<double> v43 { v1, v1, v36, v36, v4 };
    v6[0] = v7;
    const double v29 = v35[0];
    const double v41 = v43[4];
    const std::vector<double> v50 { v29, v29, v1, v41, v36 };
    std::vector<double> v69 = v50;
    const double v82 = v69[3];
    return v82;
  }
  int main() {
    std::vector<s1> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } });
    double v1(8.0);
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
