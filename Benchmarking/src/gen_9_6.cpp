  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s3(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s2 p0;
    s1 p1;
    s6(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    s6 p0;
    std::vector<std::vector<s2>> p1;
    s10(s6 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  s10 f65(const s10 &v0) {
    s10 v7 = v0;
    s10 v39 = v7;
    return v39;
  }
  s10 f36(const s10 &v0) {
    const std::vector<s10> v5 { v0, v0, v0, v0, v0 };
    std::vector<s10> v6 = v5;
    const s10 v9 = v5[4];
    const s10 v3 = v5[0];
    const s10 v10 = f65(v3);
    v6[2] = v10;
    const s10 v23 = v5[2];
    const s10 v24 = v6[4];
    v6[3] = v23;
    v6[2] = v3;
    v6[2] = v24;
    v6[0] = v0;
    v6[0] = v9;
    const s10 v61 = v6[3];
    v6[3] = v61;
    v6[4] = v0;
    v6[1] = v61;
    const s10 v161 = f65(v61);
    return v161;
  }
  double f25(const s10 &v0, const double &v1) {
    const s10 v4 = f36(v0);
    const s6 v6 = v4.p0;
    const s2 v10 = v6.p0;
    const s1 v9 = v10.p0;
    s1 v43 = v9;
    const std::vector<s0> v107 = v43.p1;
    s1 v23 = v43;
    const s0 v47 = v23.p0;
    v43.p1 = v107;
    const std::vector<std::vector<double>> v41 = v47.p0;
    const std::vector<double> v68 = v41[1];
    const double v64 = v68[0];
    double v166 = v64;
    double v161 = v166;
    return v161;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<std::vector<s10>> &v1, const s2 &v2, const double &v3) {
    const s0 v4 = v0.p1;
    double v5 = v3;
    const std::vector<s10> v6 = v1[0];
    const s10 v7 = v6[0];
    double v8 = v5;
    const std::vector<std::vector<double>> v15 = v4.p0;
    const s10 v25 = f65(v7);
    const std::vector<double> v56 = v15[1];
    std::vector<double> v34 = v56;
    v34[0] = v3;
    v34[0] = v3;
    std::vector<double> v31 = v34;
    const double v64 = v31[0];
    const double v67 = v5 + v8;
    v34[0] = v67;
    const double v83 = f25(v25, v64);
    return v83;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } } } }, { { { { 3.0 }, { 4.0 }, { 5.0 } } } } }, { { { 6.0 }, { 7.0 }, { 8.0 } } } });
    std::vector<std::vector<s10>> v1({ { { { { { { { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } } } } } }, { { { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } } } } } }, { { { { { { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } } } } }, { { { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } } } } } } } } } }, { { { { { { { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } } } } }, { { { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } } } } } }, { { { { 51.0 }, { 52.0 }, { 53.0 } } }, { { { { 54.0 }, { 55.0 }, { 56.0 } } } } } }, { { { { { { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } } } } }, { { { { 63.0 }, { 64.0 }, { 65.0 } } }, { { { { 66.0 }, { 67.0 }, { 68.0 } } } } } } } } } } });
    s2 v2({ { { { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } } } } }, { { { { 75.0 }, { 76.0 }, { 77.0 } } }, { { { { 78.0 }, { 79.0 }, { 80.0 } } } } } });
    double v3(81.0);
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
