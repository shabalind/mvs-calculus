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
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s3(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s4(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s3 p0;
    s4 p1;
    s7(s3 v0, s4 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s2 p0;
    s2 p1;
    s8(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<std::vector<s0>> p0;
    s3 p1;
    s9(std::vector<std::vector<s0>> v0, s3 v1): p0(v0), p1(v1) { }
  };
  s2 f8(const s2 &v0) {
    s2 v6 = v0;
    const s0 v5 = v6.p1;
    const std::vector<s0> v3 = v6.p0;
    std::vector<s0> v7 = v3;
    s2 v4 = v0;
    const s2 v12(v3, v5);
    s0 v2 = v5;
    v4 = v6;
    const s0 v11 = v3[0];
    s0 v15 = v2;
    v4.p1 = v5;
    const s0 v10 = v7[0];
    const s0 v9 = v3[1];
    const s0 v18 = v4.p1;
    const std::vector<std::vector<double>> v21 = v11.p1;
    v4.p1 = v2;
    v6.p1 = v10;
    s2 v13 = v6;
    v2 = v11;
    std::vector<s0> v27 = v7;
    v4.p1 = v18;
    s0 v16 = v10;
    const std::vector<std::vector<double>> v30 = v2.p1;
    const std::vector<std::vector<double>> v90 = v10.p0;
    v7[1] = v15;
    const s0 v67(v90, v21);
    v6.p1 = v11;
    s2 v86 = v6;
    const s0 v44 = v12.p1;
    const std::vector<double> v40 = v30[0];
    const std::vector<std::vector<double>> v50 = v18.p1;
    v6 = v86;
    const std::vector<s0> v64 = v13.p0;
    const std::vector<std::vector<double>> v71 = v9.p1;
    v7[1] = v44;
    const std::vector<s0> v82 = v12.p0;
    v6.p0 = v27;
    const s0 v52 = v64[0];
    v16.p1 = v50;
    v6.p0 = v82;
    v15.p0 = v71;
    std::vector<std::vector<double>> v47 = v90;
    const std::vector<std::vector<double>> v73 = v52.p0;
    v47[1] = v40;
    const std::vector<std::vector<double>> v53 = v16.p1;
    v4 = v86;
    v27[0] = v67;
    v2.p1 = v47;
    std::vector<s0> v144 = v7;
    const std::vector<double> v216 = v73[1];
    v2.p0 = v53;
    v16.p1 = v30;
    v47[0] = v216;
    v15.p0 = v30;
    v15.p1 = v50;
    v15.p1 = v73;
    v86.p0 = v144;
    return v12;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const s2 &v1, const s7 &v2, const double &v3) {
    const s2 v10 = f8(v1);
    const s8 v16(v1, v10);
    const s2 v22 = v16.p1;
    const std::vector<s0> v220 = v22.p0;
    const s0 v67 = v220[0];
    const std::vector<std::vector<double>> v53 = v67.p0;
    const std::vector<double> v79 = v53[1];
    std::vector<double> v206 = v79;
    const double v231 = v206[0];
    return v231;
  }
  int main() {
    s9 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } } }, { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } } } });
    s2 v1({ { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } });
    s7 v2({ { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } }, { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } } } } }, { { { { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } } }, { { { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } } }, { { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } } } });
    double v3(80.0);
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
