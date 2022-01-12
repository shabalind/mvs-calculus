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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v2 = v0[0];
    const s1 v4 = v2[0];
    const std::vector<std::vector<s0>> v7 = v4.p0;
    const double v17 = v1 + v1;
    const std::vector<s0> v13 = v7[0];
    const double v19 = v1 / v17;
    const s0 v30 = v13[0];
    const std::vector<std::vector<double>> v18 = v30.p1;
    const std::vector<double> v66 = v18[1];
    const double v24 = v66[0];
    const std::vector<double> v73 { v17, v24, v24, v19, v1 };
    const double v163 = v73[2];
    return v163;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } } } });
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
