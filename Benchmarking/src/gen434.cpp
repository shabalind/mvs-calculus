  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    std::vector<std::vector<double>> p6;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5, std::vector<std::vector<double>> v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  struct s1 {
    std::vector<double> p0;
    double p1;
    s1(std::vector<double> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f89(const s1 &v0) {
    s1 v4 = v0;
    const double v1 = v4.p1;
    const double v6 = v4.p1;
    const std::vector<double> v3 = v4.p0;
    double v2 = v1;
    const double v11 = v3[1];
    v4.p1 = v2;
    double v10 = v1;
    std::vector<double> v8 = v3;
    v8[1] = v11;
    v8[1] = v10;
    s1 v24 = v4;
    v24.p0 = v3;
    v8[1] = v11;
    v4.p0 = v8;
    v4.p1 = v6;
    v24.p0 = v8;
    return v24;
  }
  s1 f17(const s1 &v0) {
    const s1 v3 = f89(v0);
    const s1 v6 = f89(v0);
    const std::vector<s1> v9 { v0, v3, v0, v6, v6, v3 };
    const s1 v13 = v9[5];
    return v13;
  }
  s1 f9(const s1 &v0) {
    s1 v1 = v0;
    const s1 v2 = f17(v1);
    const std::vector<s1> v3 { v0, v0, v0, v2, v1 };
    const std::vector<double> v7 = v0.p0;
    std::vector<double> v4 = v7;
    const double v8 = v7[1];
    const s1 v11 = f17(v0);
    std::vector<s1> v9 = v3;
    v1.p1 = v8;
    v1.p0 = v7;
    const s1 v6 = f17(v1);
    const s1 v14 = f17(v1);
    const s1 v5 = f89(v2);
    v4[0] = v8;
    const s1 v13 = v3[3];
    const double v16 = v6.p1;
    const s1 v10 = f89(v13);
    const s1 v32 = f89(v14);
    const s1 v21 = f89(v10);
    const double v26 = v10.p1;
    const s1 v17 = v9[1];
    const std::vector<double> v33 = v5.p0;
    const s1 v19 = f17(v1);
    const double v23 = v21.p1;
    const double v36 = v33[0];
    v9[1] = v21;
    s1 v28 = v21;
    const std::vector<double> v62 = v13.p0;
    const double v42 = v26 / v26;
    v9[3] = v17;
    const s1 v37 = f17(v21);
    const s1 v25 = f89(v11);
    const double v24 = v14.p1;
    const double v43 = v1.p1;
    std::vector<s1> v45 = v3;
    v1.p0 = v33;
    const s1 v51 = f17(v11);
    v45[3] = v51;
    const std::vector<std::vector<s1>> v38 { v3, v45, v9 };
    const s1 v27 = f17(v11);
    v1.p0 = v62;
    v45[1] = v19;
    v4[0] = v16;
    v9[2] = v27;
    v9[0] = v25;
    const double v59 = v4[0];
    v1.p1 = v36;
    v28.p0 = v7;
    const s1 v49 = f17(v51);
    const s1 v39 = f89(v14);
    const double v40 = v62[0];
    v9[2] = v27;
    v4[1] = v43;
    s1 v99 = v1;
    const std::vector<double> v53 = v17.p0;
    v4[0] = v24;
    v45[4] = v17;
    const std::vector<s1> v71 = v38[2];
    v99.p1 = v16;
    const std::vector<double> v56 = v28.p0;
    const double v65 = v53[1];
    std::vector<std::vector<s1>> v73 = v38;
    v4[0] = v23;
    v99.p1 = v59;
    v1.p1 = v40;
    const std::vector<s1> v69 { v39, v11, v0, v32 };
    std::vector<s1> v190 = v69;
    std::vector<s1> v57 = v190;
    v4[0] = v65;
    v99.p0 = v56;
    v190[2] = v99;
    v73[2] = v71;
    const s1 v167 = v57[3];
    const s1 v87 = f17(v167);
    const std::vector<s1> v116 = v73[2];
    v9[1] = v5;
    v9 = v116;
    v9[0] = v49;
    v28.p1 = v42;
    v45[1] = v19;
    v190[2] = v37;
    return v87;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1, const s1 &v2, const s0 &v3, const s2 &v4) {
    const s1 v9 = f9(v2);
    const s1 v13 = f17(v9);
    const std::vector<s1> v45 { v13, v2, v2, v13 };
    std::vector<s1> v35 = v45;
    v35 = v45;
    std::vector<s1> v85 = v35;
    const s1 v73 = v85[3];
    s1 v54 = v73;
    v35[1] = v73;
    v35[3] = v9;
    v85[3] = v54;
    const double v70 = v54.p1;
    return v70;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 }, { 16.0 } } });
    double v1(17.0);
    s1 v2({ { 18.0, 19.0 }, 20.0 });
    s0 v3({ { { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 }, { 37.0 } } });
    s2 v4({ { { { { { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 } }, { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } } }, { { 55.0, 56.0 }, 57.0 } });
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
