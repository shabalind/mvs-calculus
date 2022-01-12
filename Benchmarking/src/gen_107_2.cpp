  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s0 p2;
    s0 p3;
    s0 p4;
    s0 p5;
    s0 p6;
    std::vector<s0> p7;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1, s0 v2, s0 v3, s0 v4, s0 v5, s0 v6, std::vector<s0> v7): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6), p7(v7) { }
  };
  s0 f97(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<std::vector<double>> v15 = v0.p0;
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<double>> v28 = v0.p0;
    const std::vector<std::vector<double>> v14 = v0.p0;
    const std::vector<double> v16 = v28[1];
    const std::vector<std::vector<double>> v18 = v0.p1;
    s0 v19 = v0;
    const std::vector<std::vector<double>> v17 = v19.p1;
    v19.p0 = v15;
    const std::vector<std::vector<double>> v20 = v19.p0;
    const std::vector<std::vector<double>> v30 = v19.p1;
    v19.p1 = v1;
    std::vector<double> v37 = v16;
    v19.p1 = v15;
    v19.p1 = v20;
    s0 v42 = v19;
    v19.p0 = v8;
    const std::vector<std::vector<double>> v29 = v19.p0;
    v19.p0 = v4;
    std::vector<std::vector<double>> v59 = v30;
    const std::vector<std::vector<double>> v62 = v0.p1;
    v42.p0 = v18;
    v42.p1 = v62;
    const std::vector<std::vector<double>> v43 = v42.p1;
    const std::vector<std::vector<double>> v65 = v0.p0;
    v19.p1 = v1;
    v19.p1 = v59;
    std::vector<std::vector<double>> v39 = v29;
    std::vector<std::vector<double>> v66 = v28;
    v42.p1 = v39;
    std::vector<std::vector<double>> v52 = v28;
    v19.p0 = v65;
    v19.p0 = v43;
    v42.p1 = v66;
    v19.p0 = v17;
    v42.p0 = v29;
    v39[1] = v37;
    v42.p1 = v52;
    v66 = v14;
    v42.p0 = v20;
    return v42;
  }
  s0 f90(const s0 &v0) {
    const s0 v6 = f97(v0);
    return v6;
  }
  s0 f87(const s0 &v0, const s0 &v1) {
    s0 v4 = v1;
    s0 v7 = v4;
    const s0 v3 = f97(v0);
    const std::vector<std::vector<double>> v6 = v0.p1;
    const s0 v5 = f97(v0);
    const s0 v9 = f90(v4);
    const s0 v8(v6, v6);
    s0 v11 = v5;
    v7.p0 = v6;
    const s0 v15 = f90(v5);
    const std::vector<std::vector<double>> v29 = v7.p0;
    s0 v2 = v3;
    const std::vector<std::vector<double>> v22 = v7.p1;
    const s0 v10 = f97(v5);
    const s0 v14 = f90(v4);
    v7.p1 = v29;
    const std::vector<std::vector<double>> v18 = v10.p0;
    const std::vector<std::vector<double>> v16 = v15.p0;
    v7.p0 = v18;
    const std::vector<s0> v19 { v14, v9, v11, v1, v2, v3, v11 };
    const std::vector<double> v13 = v18[1];
    const double v28 = v13[0];
    const std::vector<std::vector<double>> v17 = v5.p0;
    const s0 v20 = f90(v11);
    const s0 v26 = v19[0];
    std::vector<s0> v24 = v19;
    const std::vector<std::vector<double>> v55 = v2.p1;
    const s0 v34 = f90(v26);
    const s0 v42 = f97(v8);
    v4.p1 = v17;
    const s0 v21 = f90(v8);
    v7.p1 = v22;
    const s0 v45 = v19[1];
    v7.p0 = v29;
    v2 = v8;
    const std::vector<std::vector<double>> v25 = v9.p0;
    v7.p0 = v29;
    const std::vector<double> v23 = v22[0];
    v24[6] = v45;
    v24[3] = v20;
    const s0 v82 = v24[4];
    v24[1] = v3;
    const std::vector<std::vector<double>> v43 = v11.p1;
    v24[0] = v34;
    v24[2] = v42;
    const std::vector<std::vector<double>> v69 = v82.p1;
    const std::vector<std::vector<double>> v44 = v3.p1;
    v11.p0 = v43;
    v2.p1 = v16;
    std::vector<std::vector<double>> v46 = v25;
    v11.p0 = v69;
    std::vector<double> v96 = v23;
    v24[1] = v2;
    v46[0] = v96;
    v24[6] = v4;
    const double v73 = v96[0];
    s0 v71 = v21;
    std::vector<s0> v76 = v24;
    v96[0] = v28;
    v71.p1 = v44;
    v2.p0 = v17;
    v96[0] = v73;
    v7.p0 = v29;
    v71.p1 = v46;
    v76[0] = v71;
    const s0 v206 = v76[6];
    v11.p1 = v55;
    v46 = v18;
    v2 = v26;
    return v206;
  }
  s0 f78(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    s0 v6 = v0;
    const s0 v2 = f87(v6, v6);
    v6.p1 = v4;
    return v2;
  }
  s0 f54(const s1 &v0, const s0 &v1) {
    s0 v3 = v1;
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<std::vector<double>> v10 = v3.p0;
    std::vector<std::vector<double>> v25 = v10;
    const std::vector<std::vector<double>> v21 = v3.p0;
    v3.p1 = v10;
    std::vector<std::vector<double>> v50 = v25;
    v25 = v4;
    v3.p1 = v50;
    s0 v63 = v3;
    v63.p0 = v21;
    v3.p1 = v25;
    return v63;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const s1 &v2, const double &v3) {
    std::vector<s0> v6 = v1;
    const s0 v4 = v6[0];
    const s0 v13 = v6[1];
    s0 v11 = v0;
    const std::vector<std::vector<double>> v14 = v13.p1;
    s0 v5 = v13;
    v5.p1 = v14;
    const std::vector<double> v24 = v14[0];
    const s0 v17 = f54(v2, v0);
    const std::vector<std::vector<double>> v22 = v4.p0;
    v6[2] = v11;
    v11.p1 = v14;
    v6[2] = v0;
    std::vector<std::vector<double>> v20 = v14;
    v5.p0 = v20;
    v5.p1 = v20;
    v5.p1 = v22;
    const std::vector<std::vector<double>> v31 = v5.p0;
    std::vector<std::vector<double>> v77 = v31;
    v6 = v1;
    const std::vector<double> v38 = v20[1];
    v11.p1 = v77;
    const s0 v56 = f78(v17);
    std::vector<std::vector<double>> v69 = v22;
    v11.p1 = v69;
    v11.p1 = v14;
    std::vector<double> v50 = v38;
    v5.p0 = v69;
    v11.p1 = v20;
    v20[0] = v38;
    v11.p0 = v20;
    v69[0] = v50;
    v69[0] = v24;
    v50 = v38;
    v6[0] = v56;
    const double v95 = v50[0];
    return v95;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } });
    std::vector<s0> v1({ { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } });
    s1 v2({ { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } } } });
    double v3(64.0);
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
