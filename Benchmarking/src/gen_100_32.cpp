  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const std::vector<s2> v6 { v0, v0, v0, v0, v0 };
    const s2 v3 = v6[2];
    const s0 v10 = v3.p0;
    const s1 v36 = v3.p1;
    const std::vector<std::vector<double>> v25 = v10.p2;
    const std::vector<double> v33 = v25[2];
    const double v21 = v33[0];
    const s0 v40 = v36.p0;
    const std::vector<std::vector<double>> v34 = v40.p0;
    const std::vector<double> v82 = v34[0];
    const double v44 = v82[0];
    const double v53 = v44 / v21;
    return v53;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } } }, { { { { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } } }, { { { { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } } } } } });
    double v1(21.0);
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
