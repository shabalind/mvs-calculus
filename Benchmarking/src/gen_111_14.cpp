  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    std::vector<s0> p1;
    s5(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const s2 &v1, const double &v2) {
    const std::vector<std::vector<s0>> v9 = v1.p0;
    const std::vector<s0> v25 = v9[0];
    const s0 v35 = v25[0];
    const std::vector<std::vector<double>> v63 = v35.p0;
    const std::vector<double> v62 = v63[1];
    std::vector<double> v138 = v62;
    const double v89 = v138[0];
    std::vector<double> v135 = v62;
    const double v173 = v135[0];
    const double v457 = v89 / v173;
    return v457;
  }
  int main() {
    std::vector<s5> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } } });
    s2 v1({ { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } });
    double v2(18.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
