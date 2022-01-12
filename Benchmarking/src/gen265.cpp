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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    std::vector<s0> p2;
    std::vector<s0> p3;
    s2(s0 v0, s1 v1, std::vector<s0> v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  std::vector<s0> f12(const std::vector<s0> &v0) {
    std::vector<s0> v1 = v0;
    std::vector<s0> v8 = v0;
    const s0 v5 = v8[0];
    const std::vector<std::vector<double>> v4 = v5.p0;
    const std::vector<std::vector<double>> v9 = v5.p0;
    const std::vector<double> v2 = v4[1];
    const std::vector<std::vector<double>> v6 = v5.p1;
    std::vector<std::vector<double>> v11 = v6;
    const std::vector<std::vector<double>> v13 = v5.p1;
    const s0 v17(v4, v6);
    s0 v20 = v5;
    std::vector<s0> v12 = v1;
    v20.p0 = v9;
    v20.p1 = v11;
    const std::vector<std::vector<double>> v14 = v17.p0;
    v12[0] = v20;
    s0 v22 = v17;
    std::vector<std::vector<double>> v15 = v13;
    v22.p0 = v4;
    const s0 v35(v9, v11);
    const std::vector<std::vector<s0>> v26 { v8 };
    std::vector<double> v16 = v2;
    std::vector<s0> v18 = v12;
    v15[0] = v2;
    v22.p1 = v13;
    const std::vector<double> v34 = v9[2];
    v20.p1 = v13;
    const std::vector<std::vector<double>> v19 = v17.p0;
    const std::vector<std::vector<double>> v21 = v22.p0;
    std::vector<std::vector<double>> v68 = v11;
    v12[1] = v17;
    const std::vector<s0> v48 = v26[0];
    v22.p0 = v9;
    const std::vector<std::vector<double>> v45 = v5.p1;
    v8[0] = v22;
    const std::vector<double> v32 = v14[0];
    v8 = v18;
    v15[0] = v34;
    v8 = v18;
    v22.p1 = v13;
    v22.p1 = v13;
    v22.p0 = v21;
    const std::vector<std::vector<double>> v50 = v20.p1;
    v22.p1 = v50;
    v8[0] = v5;
    std::vector<std::vector<double>> v78 = v9;
    v68[0] = v16;
    v20.p0 = v19;
    v22.p0 = v78;
    const std::vector<double> v167 = v4[0];
    v22.p1 = v45;
    const s0 v65 = v48[0];
    v12[0] = v65;
    v68[0] = v32;
    s0 v140 = v35;
    v78[1] = v167;
    v22.p1 = v68;
    const std::vector<std::vector<double>> v97 = v140.p0;
    v140.p1 = v15;
    v20.p1 = v13;
    v1[0] = v65;
    v8[1] = v35;
    v12[1] = v35;
    v140.p1 = v13;
    const std::vector<std::vector<double>> v162 = v17.p1;
    v140.p1 = v162;
    v20.p0 = v97;
    return v18;
  }
  s2 f6(const s2 &v0) {
    s2 v5 = v0;
    s2 v2 = v5;
    const std::vector<s0> v4 = v2.p2;
    s2 v3 = v5;
    const s0 v9 = v4[1];
    const std::vector<std::vector<double>> v6 = v9.p1;
    s0 v7 = v9;
    const s0 v8 = v4[2];
    v5.p2 = v4;
    std::vector<s0> v15 = v4;
    v5.p0 = v9;
    v2.p2 = v15;
    std::vector<std::vector<double>> v19 = v6;
    v3.p0 = v9;
    v15[0] = v8;
    v15[1] = v9;
    std::vector<std::vector<double>> v32 = v19;
    const std::vector<std::vector<double>> v36 = v7.p1;
    v7.p1 = v36;
    v3.p0 = v7;
    v7.p1 = v32;
    return v3;
  }
  s1 f3(const s1 &v0) {
    const std::vector<s0> v4 = v0.p0;
    s1 v3 = v0;
    const std::vector<std::vector<s0>> v6 = v3.p1;
    const std::vector<s0> v7 = v6[0];
    v3.p1 = v6;
    v3.p1 = v6;
    s1 v19 = v3;
    const std::vector<std::vector<s0>> v13 = v0.p1;
    v19.p1 = v6;
    v3.p1 = v6;
    v3.p1 = v13;
    std::vector<s0> v24 = v4;
    const std::vector<s0> v28 = v19.p0;
    const std::vector<std::vector<s0>> v30 = v0.p1;
    const std::vector<s0> v40 = v3.p0;
    const s0 v44 = v4[0];
    v3.p0 = v40;
    const std::vector<s0> v60 = v30[1];
    std::vector<s0> v74 = v7;
    v19.p0 = v60;
    const std::vector<std::vector<s0>> v48 = v0.p1;
    v19.p0 = v28;
    v19.p0 = v60;
    v24[0] = v44;
    v24[0] = v44;
    v3.p1 = v48;
    v3.p0 = v28;
    v3.p1 = v13;
    v19.p0 = v24;
    s1 v121 = v19;
    v3.p0 = v24;
    v121.p0 = v74;
    return v121;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s2 &v1, const double &v2) {
    const s1 v6 = f3(v0);
    s1 v4 = v6;
    s2 v8 = v1;
    const std::vector<s0> v3 = v6.p0;
    v8.p1 = v4;
    const s2 v11 = f6(v8);
    const s2 v17 = f6(v11);
    const s0 v15 = v8.p0;
    const s0 v5 = v3[0];
    const std::vector<std::vector<double>> v34 = v15.p0;
    const s2 v39 = f6(v17);
    const std::vector<double> v14 = v34[2];
    std::vector<s0> v24 = v3;
    const s1 v19 = f3(v4);
    v4.p0 = v24;
    v24[0] = v5;
    const double v23 = v14[0];
    double v25 = v23;
    v8.p1 = v19;
    const std::vector<s0> v22 = v8.p3;
    const std::vector<s0> v30 = f12(v22);
    const std::vector<s0> v64 = f12(v22);
    const std::vector<s0> v28 = v0.p0;
    v8.p3 = v30;
    v24[0] = v5;
    const s0 v67 = v64[0];
    v24[0] = v67;
    const s0 v41 = v39.p0;
    const s0 v57 = v28[0];
    v8.p0 = v41;
    v8.p0 = v57;
    return v25;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } } });
    s2 v1({ { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } });
    double v2(56.0);
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
