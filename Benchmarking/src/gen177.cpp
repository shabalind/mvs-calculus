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
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    s2 p1;
    std::vector<s2> p2;
    s3(std::vector<std::vector<s1>> v0, s2 v1, std::vector<s2> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s8 {
    s3 p0;
    s1 p1;
    s8(s3 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s2 f26(const s2 &v0) {
    return v0;
  }
  s3 f17(const s3 &v0) {
    const s2 v6 = v0.p1;
    const s2 v5 = f26(v6);
    const std::vector<std::vector<s1>> v7 = v0.p0;
    const std::vector<s2> v2 { v5, v5, v5 };
    const s3 v14(v7, v5, v2);
    return v14;
  }
  s3 f10(const s3 &v0) {
    const s3 v1 = f17(v0);
    const s3 v7 = f17(v1);
    const std::vector<std::vector<s1>> v5 = v7.p0;
    const std::vector<s1> v8 = v5[0];
    const s3 v10 = f17(v7);
    const s2 v13 = v0.p1;
    const std::vector<s2> v2 = v0.p2;
    const s2 v23 = f26(v13);
    const std::vector<s2> v21 { v23, v13, v13, v23 };
    std::vector<s2> v14 = v2;
    const s2 v37 = v21[2];
    std::vector<s2> v24 = v2;
    s3 v27 = v10;
    const s2 v31 = f26(v37);
    const s2 v40 = f26(v31);
    v27.p2 = v2;
    v27.p2 = v14;
    const s2 v25 = f26(v37);
    const std::vector<std::vector<s1>> v32 = v1.p0;
    s3 v26 = v27;
    v14 = v24;
    v27.p1 = v25;
    v27.p1 = v13;
    const s2 v61 = f26(v40);
    v26.p1 = v25;
    std::vector<std::vector<s1>> v117 = v5;
    v26.p0 = v32;
    v27.p0 = v117;
    const s2 v112 = v24[0];
    v26.p1 = v23;
    v26.p1 = v61;
    v27.p0 = v32;
    v27.p1 = v112;
    std::vector<s1> v127 = v8;
    v117[1] = v127;
    v127 = v8;
    v27.p1 = v61;
    return v26;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    s8 v4 = v0;
    const s3 v3 = v0.p0;
    const s1 v8 = v4.p1;
    const s3 v6 = f10(v3);
    v4.p0 = v6;
    s1 v7 = v8;
    const std::vector<s0> v13 = v8.p0;
    v4.p1 = v7;
    const s0 v16 = v13[0];
    v7.p1 = v16;
    s0 v44 = v16;
    s0 v25 = v44;
    const s0 v28 = v13[0];
    const s0 v42 = v13[0];
    const std::vector<std::vector<double>> v76 = v42.p1;
    v4.p1 = v7;
    s0 v43 = v28;
    v7.p0 = v13;
    const std::vector<std::vector<double>> v66 = v43.p0;
    const std::vector<double> v61 = v66[0];
    const std::vector<std::vector<double>> v105 = v25.p1;
    v44.p1 = v105;
    v25.p1 = v76;
    std::vector<std::vector<double>> v122 = v66;
    v25.p0 = v122;
    v7.p1 = v44;
    const double v203 = v61[0];
    return v203;
  }
  int main() {
    s8 v0({ { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } }, { { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } }, { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } } }, { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } } } } }, { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } });
    double v1(72.0);
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
