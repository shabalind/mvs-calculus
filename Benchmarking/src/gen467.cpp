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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  s0 f96(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<double> v4 = v2[0];
    std::vector<std::vector<double>> v1 = v2;
    const std::vector<double> v7 = v2[0];
    v1[0] = v7;
    s0 v5 = v0;
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<double> v6 = v1[0];
    s0 v13 = v5;
    s0 v9 = v13;
    s0 v10 = v0;
    v10 = v0;
    const double v14 = v4[0];
    s0 v11 = v5;
    std::vector<double> v18 = v7;
    const std::vector<std::vector<double>> v16 = v10.p1;
    const std::vector<double> v21 = v1[1];
    v11.p0 = v1;
    const double v15 = v21[0];
    std::vector<double> v25 = v21;
    v5.p1 = v8;
    const double v40 = v18[0];
    v1[1] = v21;
    const double v36 = v40 + v15;
    v18[0] = v40;
    const std::vector<std::vector<double>> v68 = v9.p0;
    const std::vector<std::vector<double>> v43 = v9.p0;
    s0 v47 = v11;
    const std::vector<double> v26 = v68[1];
    v25[0] = v14;
    v1[0] = v6;
    const std::vector<std::vector<double>> v39 = v13.p0;
    const std::vector<s0> v49 { v47, v10, v47, v5 };
    std::vector<s0> v38 = v49;
    std::vector<s0> v56 = v49;
    v1[1] = v26;
    const std::vector<std::vector<double>> v59 = v47.p1;
    v25[0] = v36;
    const s0 v58(v68, v59);
    const std::vector<std::vector<double>> v77 = v11.p1;
    v38[3] = v58;
    const s0 v89(v1, v16);
    const std::vector<std::vector<double>> v32 = v13.p0;
    const s0 v62 = v56[3];
    std::vector<s0> v28 = v38;
    const s0 v75 = v28[3];
    const s0 v57(v39, v77);
    std::vector<std::vector<double>> v106 = v77;
    s0 v92 = v89;
    v28[0] = v57;
    v10.p0 = v32;
    const std::vector<std::vector<double>> v125 = v62.p1;
    v10.p1 = v125;
    const std::vector<std::vector<double>> v84 = v92.p0;
    const s0 v86(v43, v8);
    v106[0] = v25;
    const std::vector<std::vector<double>> v123 = v86.p1;
    std::vector<std::vector<double>> v78 = v106;
    v10.p0 = v43;
    v92.p1 = v123;
    v11.p0 = v84;
    v56[3] = v89;
    v5.p1 = v78;
    return v75;
  }
  s1 f50(const s1 &v0) {
    s1 v5 = v0;
    const s0 v7 = v0.p0;
    v5.p0 = v7;
    const std::vector<s0> v1 { v7, v7, v7, v7 };
    s0 v4 = v7;
    s0 v3 = v4;
    const s0 v6 = f96(v3);
    const s0 v11 = f96(v6);
    const s0 v17 = f96(v4);
    const s0 v15 = f96(v4);
    const s0 v10 = f96(v4);
    s1 v20 = v5;
    v20.p0 = v11;
    const std::vector<s0> v30 = v20.p1;
    const std::vector<std::vector<double>> v33 = v17.p0;
    const s0 v28 = f96(v10);
    v4.p0 = v33;
    const s0 v14 = f96(v3);
    v20.p0 = v28;
    const s0 v51 = v1[2];
    s1 v43 = v20;
    const s0 v42 = f96(v15);
    const s0 v186 = f96(v42);
    const std::vector<s0> v78 = v43.p1;
    v43.p1 = v78;
    v43.p1 = v78;
    v5.p0 = v17;
    v43.p1 = v30;
    v43.p1 = v30;
    v5.p0 = v14;
    v43.p0 = v15;
    const std::vector<std::vector<double>> v159 = v51.p1;
    v43.p1 = v78;
    v5.p1 = v78;
    v3.p1 = v159;
    const std::vector<s0> v224 = v43.p1;
    const s1 v258(v186, v224);
    return v258;
  }
  s1 f29(const s1 &v0) {
    const s0 v4 = v0.p0;
    const s1 v7 = f50(v0);
    const s1 v2 = f50(v7);
    const s0 v5 = v0.p0;
    const std::vector<s0> v14 = v0.p1;
    const s0 v8 = f96(v5);
    const s1 v6 = f50(v2);
    s0 v1 = v8;
    const s1 v3(v1, v14);
    const s1 v9 = f50(v2);
    s1 v10 = v3;
    s0 v29 = v5;
    s0 v15 = v29;
    std::vector<s0> v11 = v14;
    s1 v19 = v9;
    std::vector<s0> v23 = v11;
    const s0 v12 = v23[1];
    v11[0] = v12;
    v19.p0 = v4;
    const s0 v18 = f96(v29);
    v1 = v18;
    s0 v33 = v4;
    const s1 v36(v4, v23);
    s0 v21 = v8;
    const std::vector<std::vector<double>> v17 = v33.p0;
    const s0 v22 = v36.p0;
    const s0 v25 = f96(v18);
    std::vector<std::vector<double>> v28 = v17;
    const s0 v44 = v11[0];
    const std::vector<std::vector<double>> v37 = v21.p0;
    v23[1] = v22;
    const std::vector<s0> v57 = v36.p1;
    const s1 v62 = f50(v6);
    v23[1] = v44;
    v15.p0 = v37;
    const std::vector<s1> v48 { v9, v36, v0, v10, v19, v0, v10 };
    v11[1] = v1;
    const s0 v60 = f96(v8);
    v21.p0 = v28;
    std::vector<s1> v39 = v48;
    v21 = v25;
    const std::vector<s0> v104 = v62.p1;
    v19.p1 = v104;
    v19.p0 = v15;
    const s1 v94 = v39[0];
    v19.p1 = v57;
    const std::vector<std::vector<double>> v121 = v60.p1;
    v19.p0 = v60;
    v21.p1 = v121;
    return v94;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const std::vector<s1> v8 = v0.p0;
    const s1 v9 = v8[1];
    const s1 v43 = f29(v9);
    const double v22 = v1 * v1;
    const s0 v44 = v43.p0;
    const s0 v33 = f96(v44);
    const std::vector<std::vector<double>> v34 = v33.p0;
    const std::vector<double> v32 = v34[0];
    const double v59 = v32[0];
    const double v298 = v22 - v59;
    return v298;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } } }, { { { { { 27.0 }, { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } } } });
    double v1(33.0);
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
