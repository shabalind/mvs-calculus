  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s6 {
    var p0: Double
    var p1: [s1]
  }
  struct s9 {
    var p0: [[s6]]
    var p1: [s0]
  }
  struct s11 {
    var p0: s0
    var p1: s9
  }
  @inline(never)
  func f0(_ v0: [s11], _ v1: Double) -> Double {
    var v7: [s11] = v0
    let v6: s11 = v7[0]
    var v8: s11 = v6
    let v10: s9 = v8.p1
    v7[0] = v6
    var v9: [s11] = v0
    var v2: s9 = v10
    let v12: s0 = v6.p0
    let v21: s11 = v0[0]
    let v11: s0 = v6.p0
    v7[1] = v21
    let v16: [[Double]] = v12.p1
    var v33: [s11] = v0
    var v19: [s11] = v33
    var v25: [s11] = v0
    let v27: [[s6]] = v10.p0
    v2.p0 = v27
    let v20: [Double] = v16[1]
    let v38: s11 = v33[1]
    var v51: s0 = v12
    let v48: s11 = s11(p0: v11, p1: v10)
    let v26: s9 = v6.p1
    var v36: s11 = v48
    v2.p0 = v27
    v36.p1 = v10
    v36.p0 = v12
    let v39: s11 = v19[1]
    let v30: [[Double]] = v51.p1
    v8.p1 = v26
    v8.p1 = v10
    let v43: s9 = v48.p1
    var v32: s0 = v51
    v7[1] = v36
    let v42: [[Double]] = v51.p0
    v7[0] = v38
    let v65: [s0] = v26.p1
    let v35: s9 = s9(p0: v27, p1: v65)
    var v34: s0 = v32
    var v61: s11 = v48
    v34.p0 = v42
    v34.p1 = v30
    v2.p0 = v27
    let v28: [[s6]] = v43.p0
    let v58: s0 = v6.p0
    v2.p1 = v65
    let v81: s11 = v33[0]
    var v40: [[Double]] = v30
    var v73: s11 = v81
    var v70: s0 = v51
    v36.p0 = v70
    let v63: s0 = v65[1]
    var v80: [[Double]] = v40
    let v93: s11 = v33[0]
    v36.p1 = v2
    let v31: [s6] = v28[2]
    v25 = v9
    v61.p1 = v35
    let v74: [[Double]] = v34.p1
    let v52: s0 = v73.p0
    let v62: [[Double]] = v58.p1
    v34.p1 = v80
    let v90: [s0] = [v63, v70, v12, v34, v52]
    var v69: [s0] = v65
    let v86: s6 = v31[0]
    v40[0] = v20
    let v99: s0 = v39.p0
    v51.p0 = v42
    v32.p1 = v74
    v9[0] = v61
    v19[1] = v93
    let v123: s0 = v90[1]
    var v68: [s0] = v69
    v36.p0 = v99
    v8.p0 = v51
    v51.p1 = v74
    v70.p1 = v30
    let v180: s11 = v25[0]
    v8.p0 = v123
    v2.p1 = v68
    let v157: Double = v86.p0
    v7[1] = v180
    v80 = v62
    return v157
  }
  func benchmark() {
    let v0: [s11] = [s11(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s9(p0: [[s6(p0: 5.0, p1: [s1(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0]]), p1: [s0(p0: [[11.0], [12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]])])])], [s6(p0: 26.0, p1: [s1(p0: s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0], [31.0]]), p1: [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0], [36.0]]), s0(p0: [[37.0], [38.0], [39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0]])])])], [s6(p0: 47.0, p1: [s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0]]), p1: [s0(p0: [[53.0], [54.0], [55.0]], p1: [[56.0], [57.0]]), s0(p0: [[58.0], [59.0], [60.0]], p1: [[61.0], [62.0]]), s0(p0: [[63.0], [64.0], [65.0]], p1: [[66.0], [67.0]])])])]], p1: [s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0], [72.0]]), s0(p0: [[73.0], [74.0], [75.0]], p1: [[76.0], [77.0]])])), s11(p0: s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0]]), p1: s9(p0: [[s6(p0: 83.0, p1: [s1(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0]]), p1: [s0(p0: [[89.0], [90.0], [91.0]], p1: [[92.0], [93.0]]), s0(p0: [[94.0], [95.0], [96.0]], p1: [[97.0], [98.0]]), s0(p0: [[99.0], [100.0], [101.0]], p1: [[102.0], [103.0]])])])], [s6(p0: 104.0, p1: [s1(p0: s0(p0: [[105.0], [106.0], [107.0]], p1: [[108.0], [109.0]]), p1: [s0(p0: [[110.0], [111.0], [112.0]], p1: [[113.0], [114.0]]), s0(p0: [[115.0], [116.0], [117.0]], p1: [[118.0], [119.0]]), s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0], [124.0]])])])], [s6(p0: 125.0, p1: [s1(p0: s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0], [130.0]]), p1: [s0(p0: [[131.0], [132.0], [133.0]], p1: [[134.0], [135.0]]), s0(p0: [[136.0], [137.0], [138.0]], p1: [[139.0], [140.0]]), s0(p0: [[141.0], [142.0], [143.0]], p1: [[144.0], [145.0]])])])]], p1: [s0(p0: [[146.0], [147.0], [148.0]], p1: [[149.0], [150.0]]), s0(p0: [[151.0], [152.0], [153.0]], p1: [[154.0], [155.0]])]))]
    let v1: Double = 156.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 156.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
