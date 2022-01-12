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
  struct s6 {
    double p0;
    std::vector<s1> p1;
    s6(double v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<std::vector<s6>> p0;
    std::vector<s0> p1;
    s9(std::vector<std::vector<s6>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    s0 p0;
    s9 p1;
    s11(s0 v0, s9 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s11> &v0, const double &v1) {
    std::vector<s11> v7 = v0;
    const s11 v6 = v7[0];
    s11 v8 = v6;
    const s9 v10 = v8.p1;
    v7[0] = v6;
    std::vector<s11> v9 = v0;
    s9 v2 = v10;
    const s0 v12 = v6.p0;
    const s11 v21 = v0[0];
    const s0 v11 = v6.p0;
    v7[1] = v21;
    const std::vector<std::vector<double>> v16 = v12.p1;
    std::vector<s11> v33 = v0;
    std::vector<s11> v19 = v33;
    std::vector<s11> v25 = v0;
    const std::vector<std::vector<s6>> v27 = v10.p0;
    v2.p0 = v27;
    const std::vector<double> v20 = v16[1];
    const s11 v38 = v33[1];
    s0 v51 = v12;
    const s11 v48(v11, v10);
    const s9 v26 = v6.p1;
    s11 v36 = v48;
    v2.p0 = v27;
    v36.p1 = v10;
    v36.p0 = v12;
    const s11 v39 = v19[1];
    const std::vector<std::vector<double>> v30 = v51.p1;
    v8.p1 = v26;
    v8.p1 = v10;
    const s9 v43 = v48.p1;
    s0 v32 = v51;
    v7[1] = v36;
    const std::vector<std::vector<double>> v42 = v51.p0;
    v7[0] = v38;
    const std::vector<s0> v65 = v26.p1;
    const s9 v35(v27, v65);
    s0 v34 = v32;
    s11 v61 = v48;
    v34.p0 = v42;
    v34.p1 = v30;
    v2.p0 = v27;
    const std::vector<std::vector<s6>> v28 = v43.p0;
    const s0 v58 = v6.p0;
    v2.p1 = v65;
    const s11 v81 = v33[0];
    std::vector<std::vector<double>> v40 = v30;
    s11 v73 = v81;
    s0 v70 = v51;
    v36.p0 = v70;
    const s0 v63 = v65[1];
    std::vector<std::vector<double>> v80 = v40;
    const s11 v93 = v33[0];
    v36.p1 = v2;
    const std::vector<s6> v31 = v28[2];
    v25 = v9;
    v61.p1 = v35;
    const std::vector<std::vector<double>> v74 = v34.p1;
    const s0 v52 = v73.p0;
    const std::vector<std::vector<double>> v62 = v58.p1;
    v34.p1 = v80;
    const std::vector<s0> v90 { v63, v70, v12, v34, v52 };
    std::vector<s0> v69 = v65;
    const s6 v86 = v31[0];
    v40[0] = v20;
    const s0 v99 = v39.p0;
    v51.p0 = v42;
    v32.p1 = v74;
    v9[0] = v61;
    v19[1] = v93;
    const s0 v123 = v90[1];
    std::vector<s0> v68 = v69;
    v36.p0 = v99;
    v8.p0 = v51;
    v51.p1 = v74;
    v70.p1 = v30;
    const s11 v180 = v25[0];
    v8.p0 = v123;
    v2.p1 = v68;
    const double v157 = v86.p0;
    v7[1] = v180;
    v80 = v62;
    return v157;
  }
  int main() {
    std::vector<s11> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { 5.0, { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } } }, { { { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 }, { 25.0 } } } } } } } }, { { 26.0, { { { { { 27.0 }, { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } } }, { { { 37.0 }, { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 } } } } } } } }, { { 47.0, { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 } } }, { { { { 53.0 }, { 54.0 }, { 55.0 } }, { { 56.0 }, { 57.0 } } }, { { { 58.0 }, { 59.0 }, { 60.0 } }, { { 61.0 }, { 62.0 } } }, { { { 63.0 }, { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } } } } } } }, { { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 }, { 72.0 } } }, { { { 73.0 }, { 74.0 }, { 75.0 } }, { { 76.0 }, { 77.0 } } } } } }, { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 } } }, { { { { 83.0, { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 } } }, { { { { 89.0 }, { 90.0 }, { 91.0 } }, { { 92.0 }, { 93.0 } } }, { { { 94.0 }, { 95.0 }, { 96.0 } }, { { 97.0 }, { 98.0 } } }, { { { 99.0 }, { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 } } } } } } } }, { { 104.0, { { { { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } }, { { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } } }, { { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } } } } } } } }, { { 125.0, { { { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 } } }, { { { { 131.0 }, { 132.0 }, { 133.0 } }, { { 134.0 }, { 135.0 } } }, { { { 136.0 }, { 137.0 }, { 138.0 } }, { { 139.0 }, { 140.0 } } }, { { { 141.0 }, { 142.0 }, { 143.0 } }, { { 144.0 }, { 145.0 } } } } } } } } }, { { { { 146.0 }, { 147.0 }, { 148.0 } }, { { 149.0 }, { 150.0 } } }, { { { 151.0 }, { 152.0 }, { 153.0 } }, { { 154.0 }, { 155.0 } } } } } } });
    double v1(156.0);
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
