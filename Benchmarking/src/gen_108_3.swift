  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s4 {
    var p0: s0
    var p1: [s2]
    var p2: s0
    var p3: [s1]
    var p4: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s0, _ v2: s4, _ v3: Double) -> Double {
    let v6: s0 = v2.p0
    let v8: [[Double]] = v6.p2
    let v9: [Double] = v8[0]
    let v17: [Double] = v8[1]
    let v15: Double = v17[0]
    let v24: [Double] = v8[0]
    var v19: [Double] = v24
    let v61: Double = v19[0]
    v19[0] = v15
    v19 = v9
    return v61
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0]], p2: [[10.0], [11.0]]))
    let v1: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]], p2: [[16.0], [17.0]])
    let v2: s4 = s4(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0]], p2: [[22.0], [23.0]]), p1: [s2(p0: [s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]], p2: [[28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]], p2: [[34.0], [35.0]])), s1(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]], p2: [[40.0], [41.0]]), p1: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0]], p2: [[46.0], [47.0]]))], p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]], p2: [[52.0], [53.0]])), s2(p0: [s1(p0: s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0]], p2: [[58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]], p2: [[64.0], [65.0]])), s1(p0: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0]], p2: [[70.0], [71.0]]), p1: s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0]], p2: [[76.0], [77.0]]))], p1: s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0]], p2: [[82.0], [83.0]])), s2(p0: [s1(p0: s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0]], p2: [[88.0], [89.0]]), p1: s0(p0: [[90.0], [91.0], [92.0]], p1: [[93.0]], p2: [[94.0], [95.0]])), s1(p0: s0(p0: [[96.0], [97.0], [98.0]], p1: [[99.0]], p2: [[100.0], [101.0]]), p1: s0(p0: [[102.0], [103.0], [104.0]], p1: [[105.0]], p2: [[106.0], [107.0]]))], p1: s0(p0: [[108.0], [109.0], [110.0]], p1: [[111.0]], p2: [[112.0], [113.0]]))], p2: s0(p0: [[114.0], [115.0], [116.0]], p1: [[117.0]], p2: [[118.0], [119.0]]), p3: [s1(p0: s0(p0: [[120.0], [121.0], [122.0]], p1: [[123.0]], p2: [[124.0], [125.0]]), p1: s0(p0: [[126.0], [127.0], [128.0]], p1: [[129.0]], p2: [[130.0], [131.0]])), s1(p0: s0(p0: [[132.0], [133.0], [134.0]], p1: [[135.0]], p2: [[136.0], [137.0]]), p1: s0(p0: [[138.0], [139.0], [140.0]], p1: [[141.0]], p2: [[142.0], [143.0]]))], p4: s0(p0: [[144.0], [145.0], [146.0]], p1: [[147.0]], p2: [[148.0], [149.0]]))
    let v3: Double = 150.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 150.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
