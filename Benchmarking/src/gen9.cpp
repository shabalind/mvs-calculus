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
  struct s3 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s3(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s0> p1;
    s4(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s4 f20(const s4 &v0) {
    const std::vector<s0> v7 = v0.p1;
    std::vector<s0> v3 = v7;
    std::vector<s0> v4 = v7;
    const std::vector<s4> v5 { v0, v0, v0, v0, v0, v0, v0 };
    const s0 v6 = v0.p0;
    const s0 v8 = v3[1];
    const std::vector<s0> v14 = v0.p1;
    const s0 v1 = v4[0];
    const std::vector<s0> v2 = v0.p1;
    std::vector<s0> v9 = v14;
    s0 v12 = v1;
    s0 v17 = v6;
    s0 v13 = v1;
    const s4 v19 = v5[3];
    s0 v23 = v6;
    v9[0] = v12;
    const std::vector<std::vector<double>> v24 = v17.p1;
    s0 v18 = v8;
    v17.p1 = v24;
    v4[0] = v6;
    const s0 v27 = v0.p0;
    v3[0] = v13;
    v18.p1 = v24;
    const s0 v37 = v14[2];
    v18.p1 = v24;
    const s0 v28 = v9[0];
    std::vector<s4> v20 = v5;
    const std::vector<std::vector<double>> v16 = v28.p1;
    const std::vector<std::vector<std::vector<double>>> v38 { v24, v24, v24, v24, v16, v16, v24 };
    v18 = v28;
    std::vector<s0> v33 = v2;
    v17.p1 = v16;
    v12.p1 = v16;
    v20[6] = v0;
    s4 v22 = v0;
    const std::vector<std::vector<double>> v50 = v27.p1;
    const std::vector<std::vector<std::vector<double>>> v25 { v24, v16, v16, v16, v50, v24, v50 };
    const std::vector<std::vector<double>> v42 = v37.p0;
    const std::vector<s0> v57 = v19.p1;
    const s4 v43 = v20[2];
    const std::vector<std::vector<double>> v72 = v8.p0;
    const s0 v108 = v57[2];
    v33[1] = v1;
    const std::vector<std::vector<double>> v68 = v38[6];
    const std::vector<std::vector<double>> v36 = v108.p1;
    const s4 v29 = v20[6];
    std::vector<s4> v40 = v20;
    v40[5] = v22;
    v40[2] = v43;
    std::vector<s0> v70 = v33;
    v12.p1 = v36;
    std::vector<std::vector<double>> v75 = v72;
    v13.p1 = v24;
    v18.p1 = v68;
    v12.p0 = v75;
    v22.p0 = v1;
    v20 = v40;
    const std::vector<std::vector<double>> v65 = v25[1];
    v3[0] = v18;
    v12.p0 = v42;
    v17.p1 = v65;
    std::vector<s4> v140 = v5;
    s4 v60 = v43;
    v20[1] = v29;
    v22.p0 = v28;
    v60.p1 = v7;
    v40 = v140;
    v18.p0 = v75;
    v12.p0 = v42;
    v60.p0 = v18;
    v18.p0 = v42;
    v60.p1 = v9;
    v3[2] = v23;
    v60 = v0;
    v23.p0 = v42;
    v13.p1 = v68;
    v22.p0 = v1;
    v18.p0 = v42;
    v33[0] = v28;
    v22.p1 = v70;
    return v60;
  }
  s0 f18(const s0 &v0) {
    const std::vector<s0> v2 { v0, v0, v0 };
    const s0 v4 = v2[0];
    std::vector<s0> v14 = v2;
    const s0 v3 = v2[2];
    const s1 v12(v4, v3);
    s1 v6 = v12;
    const s0 v13 = v2[0];
    std::vector<s0> v9 = v2;
    v14[2] = v3;
    v6.p0 = v3;
    s1 v42 = v6;
    const s0 v50 = v42.p1;
    const std::vector<std::vector<s0>> v31 { v2, v2, v9, v14 };
    v14[1] = v0;
    std::vector<std::vector<s0>> v64 = v31;
    const std::vector<s0> v169 = v64[2];
    v6.p0 = v13;
    v9[0] = v50;
    const s4 v112(v3, v169);
    const s4 v157 = f20(v112);
    const s4 v128 = f20(v157);
    const s0 v105 = v128.p0;
    return v105;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const std::vector<std::vector<s3>> &v1, const double &v2) {
    const std::vector<s3> v4 = v1[0];
    double v6 = v2;
    const s3 v12 = v4[0];
    const std::vector<s0> v18 = v12.p1;
    const s0 v19 = v18[2];
    const s0 v21 = f18(v19);
    const std::vector<std::vector<double>> v10 = v21.p0;
    double v44 = v6;
    const std::vector<double> v38 = v10[0];
    const double v69 = v38[0];
    double v85 = v69;
    v85 = v69;
    v85 = v44;
    return v85;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } });
    std::vector<std::vector<s3>> v1({ { { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } } } }, { { { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } }, { { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } } } } });
    double v2(64.0);
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
