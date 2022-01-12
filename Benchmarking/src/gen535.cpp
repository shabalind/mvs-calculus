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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s1> p1;
    s3(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const s2 &v1, const s3 &v2, const double &v3) {
    const s0 v4 = v2.p0;
    const s1 v8 = v1.p1;
    s1 v5 = v8;
    const s0 v9 = v8.p0;
    v5.p0 = v4;
    const std::vector<s1> v39 { v5, v8, v5, v8 };
    std::vector<s1> v15 = v39;
    v15[2] = v5;
    const s1 v25 = v15[0];
    v5.p1 = v9;
    const s1 v19 = v39[0];
    const s0 v13 = v25.p0;
    const std::vector<std::vector<double>> v46 = v13.p1;
    v15[3] = v19;
    const std::vector<double> v31 = v46[0];
    const double v65 = v31[0];
    return v65;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } });
    s2 v1({ { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } });
    s3 v2({ { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } } });
    double v3(44.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
