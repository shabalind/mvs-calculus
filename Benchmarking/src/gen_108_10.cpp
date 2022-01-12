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
    s0 p0;
    std::vector<s1> p1;
    s2(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s2>> p0;
    s3(std::vector<std::vector<s2>> v0): p0(v0) { }
  };
  struct s4 {
    s0 p0;
    s4(s0 v0): p0(v0) { }
  };
  struct s5 {
    s0 p0;
    s4 p1;
    s5(s0 v0, s4 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    double p0;
    s1 p1;
    s7(double v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<std::vector<s4>> p0;
    s3 p1;
    s8(std::vector<std::vector<s4>> v0, s3 v1): p0(v0), p1(v1) { }
  };
  s0 f95(const s0 &v0) {
    return v0;
  }
  s1 f60(const s1 &v0, const s1 &v1) {
    const s0 v7 = v1.p0;
    s1 v6 = v1;
    s1 v4 = v6;
    v6.p0 = v7;
    s1 v2 = v6;
    const s0 v8 = f95(v7);
    v4.p0 = v8;
    v6.p1 = v7;
    const s0 v14 = v2.p0;
    v4.p1 = v14;
    v2.p1 = v8;
    const s0 v21 = f95(v7);
    const s0 v25 = f95(v21);
    const s0 v48 = v2.p1;
    s1 v29 = v4;
    const std::vector<s1> v65 { v6, v1, v29, v29, v2 };
    const s1 v94 = v65[4];
    std::vector<s1> v40 = v65;
    const s1 v56 = v40[3];
    const s0 v68 = v94.p1;
    s1 v79 = v0;
    v79 = v56;
    v6.p1 = v68;
    v2.p0 = v48;
    v29.p0 = v25;
    return v79;
  }
  s1 f54(const s1 &v0) {
    const s1 v7 = f60(v0, v0);
    const s1 v6 = f60(v0, v0);
    const s1 v10 = f60(v0, v7);
    const s1 v41 = f60(v6, v10);
    const s1 v35 = f60(v41, v6);
    s1 v34 = v35;
    return v34;
  }
  s0 f36(const s0 &v0) {
    const s0 v4 = f95(v0);
    const s0 v61 = f95(v4);
    const s1 v77(v4, v61);
    const s1 v35 = f54(v77);
    const s1 v50 = f60(v35, v77);
    const s1 v66 = f60(v50, v50);
    const s0 v93 = v66.p1;
    return v93;
  }
  s1 f18(const s1 &v0) {
    const s1 v4 = f54(v0);
    const s0 v7 = v4.p1;
    const std::vector<std::vector<double>> v3 = v7.p1;
    s1 v1 = v0;
    const s0 v6 = f36(v7);
    const s0 v9 = v1.p1;
    v1.p1 = v9;
    s0 v8 = v6;
    const std::vector<double> v17 = v3[0];
    std::vector<std::vector<double>> v13 = v3;
    s0 v12 = v8;
    s1 v33 = v1;
    const s0 v16 = f95(v9);
    v12.p0 = v13;
    v13[0] = v17;
    const s0 v26 = f36(v16);
    v33.p0 = v12;
    v33.p1 = v26;
    return v33;
  }
  __attribute__((noinline))
  double f0(const double &v0, const std::vector<s5> &v1, const s2 &v2, const std::vector<std::vector<s7>> &v3, const s7 &v4, const std::vector<s8> &v5) {
    const s0 v8 = v2.p0;
    const s0 v9 = f36(v8);
    const s1 v23(v9, v8);
    const s1 v31 = f18(v23);
    const s0 v43 = v31.p0;
    const std::vector<std::vector<double>> v66 = v43.p0;
    const std::vector<double> v89 = v66[0];
    const double v115 = v89[0];
    return v115;
  }
  int main() {
    double v0(0.0);
    std::vector<s5> v1({ { { { { 1.0 } }, { { 2.0 } } }, { { { { 3.0 } }, { { 4.0 } } } } }, { { { { 5.0 } }, { { 6.0 } } }, { { { { 7.0 } }, { { 8.0 } } } } }, { { { { 9.0 } }, { { 10.0 } } }, { { { { 11.0 } }, { { 12.0 } } } } } });
    s2 v2({ { { { 13.0 } }, { { 14.0 } } }, { { { { { 15.0 } }, { { 16.0 } } }, { { { 17.0 } }, { { 18.0 } } } }, { { { { 19.0 } }, { { 20.0 } } }, { { { 21.0 } }, { { 22.0 } } } }, { { { { 23.0 } }, { { 24.0 } } }, { { { 25.0 } }, { { 26.0 } } } } } });
    std::vector<std::vector<s7>> v3({ { { 27.0, { { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } } } } }, { { 32.0, { { { { 33.0 } }, { { 34.0 } } }, { { { 35.0 } }, { { 36.0 } } } } } } });
    s7 v4({ 37.0, { { { { 38.0 } }, { { 39.0 } } }, { { { 40.0 } }, { { 41.0 } } } } });
    std::vector<s8> v5({ { { { { { { { 42.0 } }, { { 43.0 } } } } } }, { { { { { { { 44.0 } }, { { 45.0 } } }, { { { { { 46.0 } }, { { 47.0 } } }, { { { 48.0 } }, { { 49.0 } } } }, { { { { 50.0 } }, { { 51.0 } } }, { { { 52.0 } }, { { 53.0 } } } }, { { { { 54.0 } }, { { 55.0 } } }, { { { 56.0 } }, { { 57.0 } } } } } } } } } } });
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
