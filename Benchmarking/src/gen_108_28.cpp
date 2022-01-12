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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s1 f21(const s1 &v0) {
    const s0 v3 = v0.p1;
    s1 v13 = v0;
    s0 v2 = v3;
    const std::vector<s0> v12 = v13.p0;
    v13.p0 = v12;
    const s1 v62(v12, v2);
    s1 v28 = v62;
    return v28;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v4 = f21(v0);
    const std::vector<s0> v7 = v4.p0;
    const s0 v14 = v7[1];
    double v10 = v1;
    const s0 v16 = v7[1];
    const std::vector<std::vector<double>> v51 = v16.p0;
    const std::vector<std::vector<double>> v63 = v14.p0;
    const std::vector<double> v48 { v1, v1, v10, v10 };
    const std::vector<double> v73 = v63[1];
    std::vector<double> v69 = v48;
    const std::vector<double> v62 = v51[0];
    const double v50 = v73[0];
    v69[3] = v50;
    const double v86 = v62[0];
    const double v163 = v69[2];
    v69[0] = v86;
    return v163;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } });
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
