  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
    var p2: s0
    var p3: s0
    var p4: [Double]
    var p5: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s4 {
    var p0: [s0]
    var p1: Double
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: s4, _ v2: s4, _ v3: Double) -> Double {
    let v6: Double = v3 + v3
    var v15: Double = v6
    let v19: Double = v2.p1
    let v30: [Double] = [v19, v19, v3, v3, v15, v3, v3]
    let v50: Double = v30[6]
    var v42: Double = v50
    var v49: s4 = v1
    v15 = v6
    var v59: [Double] = v30
    v59[6] = v6
    let v90: Double = v49.p1
    let v84: Double = v59[0]
    let v57: Double = v1.p1
    v49.p1 = v15
    v49.p1 = v42
    let v163: Double = v84 + v57
    let v186: Double = v163 + v90
    v49.p1 = v19
    return v186
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p2: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p3: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), p4: [24.0, 25.0, 26.0], p5: [s0(p0: [[27.0], [28.0], [29.0]], p1: [[30.0]]), s0(p0: [[31.0], [32.0], [33.0]], p1: [[34.0]])]), s1(p0: [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0], [41.0]], p1: [[42.0]]), s0(p0: [[43.0], [44.0], [45.0]], p1: [[46.0]])], p1: s0(p0: [[47.0], [48.0], [49.0]], p1: [[50.0]]), p2: s0(p0: [[51.0], [52.0], [53.0]], p1: [[54.0]]), p3: s0(p0: [[55.0], [56.0], [57.0]], p1: [[58.0]]), p4: [59.0, 60.0, 61.0], p5: [s0(p0: [[62.0], [63.0], [64.0]], p1: [[65.0]]), s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0]])])], p1: s0(p0: [[70.0], [71.0], [72.0]], p1: [[73.0]]))
    let v1: s4 = s4(p0: [s0(p0: [[74.0], [75.0], [76.0]], p1: [[77.0]]), s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0]])], p1: 82.0)
    let v2: s4 = s4(p0: [s0(p0: [[83.0], [84.0], [85.0]], p1: [[86.0]]), s0(p0: [[87.0], [88.0], [89.0]], p1: [[90.0]])], p1: 91.0)
    let v3: Double = 92.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 92.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
