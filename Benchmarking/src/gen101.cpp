  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    double p1;
    s3(s1 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s1 p1;
    s4(s3 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f12(const s0 &v0) {
    const std::vector<double> v2 = v0.p0;
    const double v7 = v2[0];
    s0 v4 = v0;
    v4.p0 = v2;
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<double> v5 = v4.p0;
    std::vector<std::vector<double>> v13 = v9;
    v4.p0 = v5;
    s0 v19 = v4;
    const std::vector<double> v30 = v1[1];
    v4.p1 = v13;
    std::vector<std::vector<double>> v11 = v9;
    v19.p1 = v13;
    const std::vector<double> v17 = v4.p0;
    std::vector<std::vector<double>> v25 = v13;
    const std::vector<double> v27 = v19.p0;
    const std::vector<double> v22 { v7, v7 };
    const std::vector<double> v52 = v11[2];
    v19.p0 = v27;
    std::vector<double> v47 = v30;
    v13[0] = v47;
    v19.p0 = v17;
    const s0 v57(v27, v11);
    v19.p0 = v22;
    v13[1] = v52;
    v19.p1 = v25;
    v13[0] = v30;
    return v57;
  }
  std::vector<s0> f11(const std::vector<s0> &v0) {
    std::vector<s0> v5 = v0;
    std::vector<s0> v4 = v0;
    std::vector<s0> v2 = v5;
    std::vector<s0> v3 = v0;
    std::vector<s0> v7 = v4;
    const s0 v6 = v3[0];
    const s0 v8 = f12(v6);
    v3 = v0;
    const std::vector<double> v1 = v8.p0;
    const std::vector<std::vector<double>> v11 = v6.p1;
    const s0 v10 = v0[1];
    const s0 v9 = f12(v6);
    v7[1] = v8;
    const s0 v18(v1, v11);
    v4 = v3;
    const s0 v16 = f12(v9);
    const std::vector<std::vector<s0>> v26 { v7, v7, v0, v0, v2 };
    v2[0] = v10;
    const s0 v41 = f12(v9);
    v7[1] = v16;
    std::vector<std::vector<s0>> v33 = v26;
    const std::vector<s0> v94 = v33[4];
    v7[0] = v41;
    v5[0] = v18;
    return v94;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    std::vector<s1> v5 = v0;
    const s1 v4 = v5[1];
    const std::vector<std::vector<s0>> v7 = v4.p0;
    s1 v11 = v4;
    const std::vector<s0> v3 = v7[0];
    v11.p0 = v7;
    std::vector<std::vector<s0>> v9 = v7;
    v11.p0 = v9;
    v11.p0 = v9;
    const std::vector<s0> v13 = v11.p1;
    v9[0] = v3;
    const std::vector<s0> v10 = f11(v13);
    const std::vector<s0> v12 = f11(v10);
    const s0 v38 = v3[0];
    const std::vector<std::vector<double>> v23 = v38.p1;
    v5[2] = v11;
    s0 v14 = v38;
    v11.p1 = v12;
    s0 v25 = v38;
    std::vector<s0> v18 = v3;
    v25.p1 = v23;
    std::vector<s0> v41 = v18;
    const s0 v22 = v41[0];
    const s0 v21 = f12(v25);
    v25.p1 = v23;
    const s3 v61(v11, v1);
    const s0 v56 = v3[0];
    const s4 v40(v61, v4);
    std::vector<s0> v68 = v41;
    v14 = v56;
    v14.p1 = v23;
    v14.p1 = v23;
    const std::vector<double> v42 = v21.p0;
    v14.p1 = v23;
    const s3 v47 = v40.p0;
    v18[0] = v14;
    v9[0] = v41;
    v25.p0 = v42;
    std::vector<std::vector<double>> v52 = v23;
    const double v130 = v47.p1;
    v14.p1 = v52;
    v68[0] = v22;
    v14.p0 = v42;
    v11.p1 = v13;
    v9[1] = v68;
    return v130;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0, 1.0 }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { 5.0, 6.0 }, { { 7.0 }, { 8.0 }, { 9.0 } } } } }, { { { 10.0, 11.0 }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { 15.0, 16.0 }, { { 17.0 }, { 18.0 }, { 19.0 } } } } }, { { { { { 20.0, 21.0 }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { 25.0, 26.0 }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { 30.0, 31.0 }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { 35.0, 36.0 }, { { 37.0 }, { 38.0 }, { 39.0 } } } } }, { { { { { 40.0, 41.0 }, { { 42.0 }, { 43.0 }, { 44.0 } } } }, { { { 45.0, 46.0 }, { { 47.0 }, { 48.0 }, { 49.0 } } } } }, { { { 50.0, 51.0 }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { 55.0, 56.0 }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } });
    double v1(60.0);
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
