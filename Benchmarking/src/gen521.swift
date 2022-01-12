  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s1]
  }
  struct s8 {
    var p0: s2
    var p1: [[s2]]
  }
  func f29(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v0
    v3 = v7
    var v6: Double = v3
    v3 = v6
    var v2: Double = v0
    var v9: Double = v2
    var v12: Double = v9
    let v13: [Double] = [v3, v12]
    v7 = v2
    let v33: [[Double]] = [v13, v13, v13, v13, v13, v13, v13]
    let v39: [Double] = v33[0]
    var v25: [Double] = v13
    let v35: Double = v39[0]
    var v19: [Double] = v25
    v19[0] = v7
    var v27: [Double] = v19
    let v48: Double = v27[1]
    v27[0] = v35
    return v48
  }
  @inline(never)
  func f0(_ v0: s8, _ v1: Double) -> Double {
    let v5: Double = f29(v1)
    var v7: Double = v5
    return v7
  }
  func benchmark() {
    let v0: s8 = s8(p0: s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0]], p3: [[7.0], [8.0]]), p1: [s1(p0: s0(p0: [[9.0], [10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0], [15.0]], p3: [[16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0]], p1: [[20.0], [21.0], [22.0]], p2: [[23.0], [24.0]], p3: [[25.0], [26.0]]))]), p1: [[s2(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0], [30.0], [31.0]], p2: [[32.0], [33.0]], p3: [[34.0], [35.0]]), p1: [s1(p0: s0(p0: [[36.0], [37.0]], p1: [[38.0], [39.0], [40.0]], p2: [[41.0], [42.0]], p3: [[43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]], p2: [[50.0], [51.0]], p3: [[52.0], [53.0]]))])], [s2(p0: s0(p0: [[54.0], [55.0]], p1: [[56.0], [57.0], [58.0]], p2: [[59.0], [60.0]], p3: [[61.0], [62.0]]), p1: [s1(p0: s0(p0: [[63.0], [64.0]], p1: [[65.0], [66.0], [67.0]], p2: [[68.0], [69.0]], p3: [[70.0], [71.0]]), p1: s0(p0: [[72.0], [73.0]], p1: [[74.0], [75.0], [76.0]], p2: [[77.0], [78.0]], p3: [[79.0], [80.0]]))])]])
    let v1: Double = 81.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 81.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
