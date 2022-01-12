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
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s2 p1;
    s3(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s0 f21(const s0 &v0) {
    s0 v7 = v0;
    v7 = v0;
    const std::vector<s0> v5 { v7, v7, v7, v0, v0, v0, v0 };
    const std::vector<s0> v4 { v0, v7, v0, v0, v0, v7, v7 };
    const s0 v2 = v5[4];
    const std::vector<std::vector<double>> v3 = v7.p1;
    std::vector<std::vector<double>> v6 = v3;
    const s0 v11 = v4[5];
    v7.p1 = v6;
    s0 v10 = v11;
    s0 v9 = v2;
    v10.p1 = v6;
    s0 v15 = v0;
    const std::vector<double> v14 = v3[0];
    v10.p1 = v6;
    v6[1] = v14;
    v6[1] = v14;
    const std::vector<std::vector<double>> v17 = v2.p0;
    const std::vector<std::vector<double>> v41 = v7.p1;
    const std::vector<std::vector<double>> v16 = v9.p0;
    const std::vector<double> v18 = v41[1];
    std::vector<double> v19 = v14;
    v6[1] = v19;
    const s0 v20 = v5[3];
    v6[1] = v14;
    const s0 v30 = v4[5];
    const std::vector<std::vector<double>> v29 = v20.p0;
    s0 v21 = v2;
    const std::vector<double> v22 = v17[0];
    const std::vector<std::vector<double>> v23 = v11.p0;
    v21.p0 = v29;
    v6[0] = v14;
    const s0 v31 = v5[4];
    std::vector<s0> v27 = v5;
    v10.p0 = v29;
    v15.p0 = v16;
    const s0 v51 = v27[4];
    const s0 v55 = v27[5];
    const double v49 = v19[0];
    v21 = v9;
    v27[4] = v21;
    const std::vector<double> v40 = v23[0];
    double v37 = v49;
    v19[0] = v49;
    v19[0] = v49;
    v27[3] = v21;
    v6[0] = v18;
    v6[0] = v22;
    const std::vector<std::vector<double>> v60 = v15.p1;
    v10.p1 = v60;
    v21 = v31;
    const std::vector<std::vector<double>> v46 = v20.p0;
    v9.p0 = v23;
    const s0 v42 = v5[4];
    const s2 v36(v31, v30);
    const std::vector<std::vector<double>> v73 = v42.p1;
    v7.p1 = v6;
    v19[0] = v37;
    v19[0] = v49;
    const s0 v74 = v36.p0;
    const std::vector<std::vector<double>> v63 = v55.p1;
    const std::vector<std::vector<double>> v52 = v10.p0;
    v27[0] = v74;
    v7.p0 = v52;
    v6[0] = v40;
    v9.p1 = v73;
    v9.p0 = v23;
    v6[0] = v22;
    v9.p0 = v46;
    v9.p1 = v63;
    return v51;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const s1 &v1, const std::vector<s3> &v2, const double &v3) {
    s3 v5 = v0;
    s3 v7 = v5;
    s3 v9 = v7;
    const s2 v8 = v5.p1;
    const std::vector<s0> v14 = v9.p0;
    const s0 v13 = v14[0];
    const s3 v21 = v2[0];
    const s0 v17 = f21(v13);
    s0 v22 = v17;
    v5 = v9;
    const std::vector<std::vector<double>> v33 = v17.p1;
    v9.p0 = v14;
    const s0 v51 = v8.p0;
    const std::vector<std::vector<double>> v45 = v51.p1;
    std::vector<std::vector<double>> v66 = v33;
    const s2 v98 = v21.p1;
    const std::vector<std::vector<double>> v60 = v22.p1;
    const std::vector<double> v106 = v60[1];
    v22.p1 = v45;
    v7.p1 = v98;
    v22.p1 = v33;
    v22.p1 = v66;
    const double v93 = v106[0];
    return v93;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    s1 v1({ { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } });
    std::vector<s3> v2({ { { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } } } });
    double v3(50.0);
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
