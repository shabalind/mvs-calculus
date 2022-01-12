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
  s0 f59(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<double> v4 = v2[0];
    s0 v7 = v0;
    std::vector<std::vector<double>> v9 = v3;
    v9[0] = v4;
    std::vector<std::vector<double>> v8 = v2;
    const std::vector<std::vector<double>> v11 = v7.p0;
    const std::vector<std::vector<double>> v5 = v7.p1;
    std::vector<std::vector<double>> v10 = v11;
    v7.p0 = v10;
    v8[0] = v4;
    std::vector<std::vector<double>> v17 = v11;
    std::vector<std::vector<double>> v16 = v9;
    v7.p0 = v11;
    const std::vector<double> v21 = v17[0];
    v8[0] = v21;
    const std::vector<std::vector<double>> v12 = v7.p0;
    const std::vector<double> v24 = v17[1];
    const std::vector<std::vector<double>> v27 = v7.p1;
    const std::vector<double> v50 = v10[1];
    v17[2] = v21;
    v8[0] = v50;
    const std::vector<double> v37 = v12[2];
    s0 v30 = v7;
    const std::vector<std::vector<double>> v23 = v30.p1;
    v16[0] = v4;
    s0 v36 = v0;
    s0 v101 = v36;
    const s0 v56(v10, v16);
    const std::vector<std::vector<double>> v67 = v101.p0;
    const std::vector<std::vector<double>> v63 = v56.p0;
    v30.p0 = v67;
    v36.p0 = v17;
    v17[2] = v37;
    const std::vector<std::vector<double>> v85 = v56.p0;
    v9[0] = v24;
    v36.p1 = v23;
    const s0 v71(v67, v5);
    v30 = v0;
    v30.p1 = v9;
    v8 = v3;
    v36.p1 = v27;
    v7.p0 = v85;
    v101.p1 = v8;
    const std::vector<std::vector<double>> v137 = v30.p0;
    v7.p0 = v63;
    v17 = v137;
    return v71;
  }
  s0 f4(const s0 &v0) {
    s0 v3 = v0;
    const s0 v2 = f59(v3);
    s0 v6 = v0;
    const s0 v1 = f59(v3);
    const s0 v4 = f59(v3);
    const s0 v8 = f59(v2);
    s0 v9 = v4;
    const std::vector<std::vector<double>> v5 = v1.p0;
    const s0 v11 = f59(v8);
    std::vector<std::vector<double>> v15 = v5;
    const std::vector<std::vector<double>> v17 = v3.p0;
    std::vector<std::vector<double>> v10 = v17;
    const std::vector<std::vector<double>> v21 = v4.p0;
    const std::vector<double> v18 = v5[0];
    s0 v16 = v1;
    const std::vector<std::vector<double>> v26 = v9.p0;
    v3.p0 = v15;
    const std::vector<double> v22 = v21[1];
    std::vector<std::vector<double>> v14 = v17;
    std::vector<double> v20 = v18;
    std::vector<std::vector<double>> v33 = v14;
    const std::vector<double> v42 = v26[1];
    const s0 v24 = f59(v0);
    std::vector<std::vector<double>> v35 = v17;
    const std::vector<double> v19 = v10[1];
    const std::vector<std::vector<double>> v41 = v24.p0;
    s0 v36 = v11;
    const std::vector<std::vector<double>> v51 { v42, v20, v19, v20, v19, v20, v20 };
    v33[1] = v22;
    v14[1] = v22;
    std::vector<double> v37 = v19;
    const s0 v104 = f59(v16);
    v16.p0 = v15;
    const double v55 = v37[0];
    const std::vector<std::vector<std::vector<double>>> v49 { v51, v51 };
    double v61 = v55;
    v20[0] = v55;
    s0 v40 = v36;
    const s0 v66 = f59(v104);
    v40.p0 = v41;
    v37[0] = v55;
    v36.p0 = v33;
    v3.p0 = v35;
    const s0 v72 = f59(v40);
    const s0 v79 = f59(v72);
    const s0 v112 = f59(v66);
    std::vector<std::vector<double>> v70 = v15;
    v14[1] = v19;
    const std::vector<std::vector<double>> v80 = v49[0];
    const std::vector<double> v58 = v80[1];
    const s0 v94 = f59(v79);
    const std::vector<std::vector<double>> v97 = v6.p1;
    const double v82 = v61 / v55;
    const std::vector<double> v87 = v97[0];
    const std::vector<std::vector<double>> v48 = v112.p0;
    v14[2] = v58;
    v15[2] = v87;
    v10[2] = v58;
    v9.p0 = v70;
    const s0 v177 = f59(v94);
    const s0 v137 = f59(v177);
    v16.p1 = v97;
    v37[0] = v82;
    v6.p0 = v48;
    return v137;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<s1> &v1, const double &v2) {
    const double v4 = v2 / v2;
    const s0 v7 = v0.p1;
    s0 v6 = v7;
    const s0 v5 = f4(v6);
    const std::vector<std::vector<double>> v15 = v6.p0;
    const std::vector<std::vector<double>> v10 = v5.p0;
    const std::vector<double> v14 = v15[1];
    std::vector<std::vector<double>> v21 = v10;
    const double v26 = v14[0];
    v21[1] = v14;
    v6.p0 = v21;
    const double v40 = v4 * v26;
    v6.p0 = v10;
    return v40;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } });
    std::vector<s1> v1({ { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } }, { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } });
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
