  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<std::vector<s2>> p1;
    s3(s0 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  s0 f111(const s0 &v0) {
    s0 v1 = v0;
    s0 v2 = v1;
    s0 v6 = v0;
    v2 = v1;
    const std::vector<std::vector<double>> v3 = v6.p0;
    const std::vector<std::vector<double>> v11 = v1.p0;
    std::vector<std::vector<double>> v4 = v3;
    const std::vector<std::vector<double>> v9 = v2.p2;
    const std::vector<double> v7 = v3[0];
    const s0 v10(v11, v4, v9);
    v6.p1 = v11;
    s0 v8 = v6;
    std::vector<std::vector<double>> v14 = v9;
    s0 v22 = v8;
    v14[0] = v7;
    const std::vector<double> v17 = v9[0];
    const std::vector<std::vector<double>> v16 = v1.p1;
    std::vector<std::vector<double>> v21 = v9;
    v14[1] = v17;
    v4[1] = v17;
    const std::vector<std::vector<double>> v28 = v22.p0;
    const std::vector<std::vector<double>> v24 = v0.p1;
    v4[0] = v17;
    const std::vector<double> v52 = v16[2];
    v4[1] = v7;
    v14[0] = v17;
    v4[2] = v52;
    const std::vector<double> v23 = v21[1];
    v4[1] = v23;
    const std::vector<std::vector<double>> v55 = v2.p2;
    const std::vector<double> v40 = v14[0];
    v21 = v9;
    std::vector<std::vector<double>> v27 = v28;
    v21 = v14;
    const std::vector<std::vector<double>> v44 = v22.p2;
    v14[1] = v40;
    v6.p1 = v11;
    v14[1] = v17;
    const std::vector<std::vector<double>> v69 = v6.p0;
    v1.p2 = v44;
    v6.p1 = v69;
    const std::vector<std::vector<double>> v31 = v1.p0;
    const std::vector<std::vector<double>> v45 = v10.p0;
    v22.p1 = v24;
    v22.p2 = v55;
    std::vector<std::vector<double>> v38 = v27;
    std::vector<std::vector<double>> v306 = v55;
    v1.p0 = v31;
    std::vector<std::vector<double>> v114 = v38;
    const std::vector<std::vector<double>> v120 = v1.p0;
    const s0 v54(v45, v27, v306);
    v22.p0 = v114;
    v1.p0 = v38;
    v2.p1 = v120;
    return v54;
  }
  s0 f107(const s0 &v0) {
    s0 v6 = v0;
    s0 v2 = v6;
    const s0 v5 = f111(v0);
    s0 v7 = v6;
    s0 v11 = v6;
    s0 v17 = v6;
    s0 v3 = v0;
    const std::vector<std::vector<double>> v10 = v11.p1;
    const std::vector<std::vector<double>> v13 = v0.p1;
    const s0 v14 = f111(v2);
    const std::vector<std::vector<double>> v24 = v17.p0;
    v11.p1 = v10;
    const s0 v34 = f111(v3);
    s0 v22 = v14;
    const std::vector<std::vector<double>> v47 = v5.p2;
    v3.p2 = v47;
    const s0 v19 = f111(v22);
    v2.p0 = v10;
    const std::vector<std::vector<double>> v27 = v2.p0;
    const std::vector<std::vector<double>> v36 = v7.p0;
    v11.p0 = v13;
    const s0 v28 = f111(v19);
    v6.p1 = v27;
    const std::vector<std::vector<double>> v61 = v17.p0;
    v7.p1 = v61;
    v2.p1 = v36;
    const s0 v58 = f111(v28);
    const std::vector<std::vector<double>> v93 = v34.p0;
    v22.p0 = v24;
    v22 = v19;
    v7.p1 = v93;
    return v58;
  }
  s2 f102(const s2 &v0) {
    const std::vector<s0> v4 = v0.p1;
    const std::vector<s0> v3 = v0.p1;
    const s0 v2 = v4[0];
    const s1 v7 = v0.p0;
    const std::vector<s2> v9 { v0, v0, v0, v0, v0 };
    const s0 v28 = v3[0];
    std::vector<s0> v22 = v3;
    const s2 v14 = v9[0];
    s2 v27 = v14;
    v27.p1 = v22;
    s1 v37 = v7;
    v37.p0 = v4;
    v27.p1 = v3;
    v27.p0 = v37;
    v37.p1 = v2;
    const s0 v33 = f111(v28);
    v37.p1 = v33;
    return v27;
  }
  s3 f100(const s3 &v0, const s3 &v1, const s3 &v2) {
    const std::vector<s3> v4 { v2 };
    std::vector<s3> v5 = v4;
    const s3 v7 = v4[0];
    v5[0] = v1;
    v5 = v4;
    v5[0] = v0;
    s3 v28 = v0;
    v5[0] = v28;
    std::vector<s3> v24 = v4;
    v5[0] = v0;
    v24 = v5;
    v24[0] = v7;
    v24[0] = v7;
    v24[0] = v2;
    const s3 v19 = v24[0];
    return v19;
  }
  double f99(const double &v0) {
    double v5 = v0;
    v5 = v0;
    v5 = v0;
    const std::vector<double> v1 { v5, v5 };
    double v2 = v5;
    std::vector<double> v11 = v1;
    const double v7 = v1[0];
    double v8 = v0;
    const double v3 = v11[0];
    v11[0] = v2;
    std::vector<double> v4 = v1;
    double v17 = v0;
    const double v9 = v1[1];
    const double v22 = v4[1];
    const double v10 = v1[0];
    v4[1] = v7;
    std::vector<double> v19 = v4;
    v17 = v5;
    v19[0] = v22;
    const double v21 = v10 + v22;
    std::vector<double> v24 = v19;
    const double v18 = v19[0];
    const double v15 = v19[0];
    v4[1] = v18;
    std::vector<double> v20 = v1;
    v19[0] = v3;
    const double v13 = v11[1];
    v19[1] = v9;
    const double v39 = v20[0];
    v24[1] = v21;
    const double v44 = v11[0];
    v19[1] = v13;
    v24[0] = v17;
    v19[0] = v8;
    const double v32 = v11[0];
    v19[0] = v32;
    const double v47 = v1[0];
    const double v78 = v24[0];
    v5 = v47;
    const std::vector<double> v46 { v44, v39, v15, v78, v17 };
    const double v126 = v46[4];
    return v126;
  }
  s2 f75(const s2 &v0) {
    const std::vector<s2> v3 { v0, v0, v0, v0 };
    const s2 v11 = v3[1];
    return v11;
  }
  std::vector<s2> f70(const std::vector<s2> &v0) {
    const s2 v1 = v0[0];
    s2 v6 = v1;
    const std::vector<s2> v5 { v6, v6 };
    const std::vector<s0> v10 = v6.p1;
    std::vector<s0> v14 = v10;
    const s0 v9 = v14[0];
    const s0 v12 = f107(v9);
    const s0 v40 = f107(v12);
    const s2 v22 = v5[0];
    const s0 v60 = f107(v9);
    v14[0] = v60;
    const s2 v73 = f75(v22);
    std::vector<s2> v49 = v0;
    const s1 v27(v10, v40);
    v49[0] = v73;
    v6.p0 = v27;
    std::vector<s2> v105 = v49;
    return v105;
  }
  s3 f45(const s3 &v0) {
    const s3 v6 = f100(v0, v0, v0);
    s3 v4 = v0;
    const std::vector<std::vector<s2>> v3 = v6.p1;
    v4.p1 = v3;
    const std::vector<s2> v9 = v3[1];
    s3 v11 = v0;
    const std::vector<s2> v8 = f70(v9);
    v4.p1 = v3;
    v11.p1 = v3;
    v11.p1 = v3;
    const std::vector<std::vector<s2>> v14 = v6.p1;
    const s2 v5 = v8[0];
    std::vector<std::vector<s2>> v20 = v14;
    const std::vector<s2> v16 = v20[1];
    const std::vector<s2> v23 = f70(v8);
    std::vector<s2> v30 = v9;
    v11.p1 = v14;
    v11.p1 = v20;
    const s2 v19 = f102(v5);
    v20[1] = v23;
    const s3 v70 = f100(v4, v11, v4);
    v20[0] = v16;
    v20[1] = v30;
    v30[0] = v19;
    v20[1] = v16;
    v4.p1 = v3;
    return v70;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s3 &v1, const double &v2) {
    const s3 v28 = f45(v1);
    const s0 v68 = v28.p0;
    const std::vector<std::vector<double>> v73 = v68.p0;
    const std::vector<double> v81 = v73[2];
    const double v42 = v81[0];
    const double v109 = f99(v42);
    double v108 = v109;
    v108 = v109;
    return v108;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } });
    s3 v1({ { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } } }, { { { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } }, { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 }, { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } } }, { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } } } } } });
    double v2(72.0);
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
