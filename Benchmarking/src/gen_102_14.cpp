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
    s0 p0;
    s0 p1;
    std::vector<s0> p2;
    s2(s0 v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    s3(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s3> p0;
    s1 p1;
    s5(std::vector<s3> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s2 p0;
    std::vector<s5> p1;
    s8(s2 v0, std::vector<s5> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s3 &v1, const s0 &v2, const s8 &v3, const double &v4) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    std::vector<std::vector<double>> v9 = v6;
    const std::vector<double> v15 = v9[0];
    const std::vector<double> v18 = v9[0];
    const std::vector<std::vector<double>> v14 = v0.p0;
    v9[0] = v18;
    v9[0] = v18;
    const std::vector<std::vector<double>> v32 = v2.p1;
    const std::vector<double> v37 = v32[0];
    v9[0] = v15;
    const std::vector<std::vector<double>> v46 { v15, v37, v15 };
    const std::vector<double> v55 = v46[2];
    v9[0] = v37;
    const std::vector<double> v134 = v46[0];
    std::vector<std::vector<double>> v65 = v46;
    const std::vector<double> v87 = v65[0];
    v65[1] = v15;
    v65[2] = v134;
    v9[0] = v55;
    v65[2] = v18;
    v65[2] = v87;
    const double v88 = v18[0];
    v65[2] = v87;
    double v97 = v88;
    const std::vector<double> v180 = v14[0];
    const std::vector<double> v234 = v65[2];
    v9[0] = v234;
    v65[2] = v180;
    return v97;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    s3 v1({ { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { { { 10.0 } }, { { 11.0 } } } } } } });
    s0 v2({ { { 12.0 } }, { { 13.0 } } });
    s8 v3({ { { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } }, { { { { 18.0 } }, { { 19.0 } } } } }, { { { { { { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } }, { { { { 24.0 } }, { { 25.0 } } } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { { { 28.0 } }, { { 29.0 } } } } } } }, { { { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } }, { { { { 34.0 } }, { { 35.0 } } } } }, { { { { 36.0 } }, { { 37.0 } } }, { { { { { 38.0 } }, { { 39.0 } } } } } } } }, { { { { 40.0 } }, { { 41.0 } } }, { { { { { 42.0 } }, { { 43.0 } } } } } } } } });
    double v4(44.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
