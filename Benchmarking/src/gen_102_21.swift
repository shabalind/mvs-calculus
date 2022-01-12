  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f39(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v0
    var v1: Double = v3
    var v2: Double = v0
    var v5: Double = v6
    var v4: Double = v5
    v5 = v4
    let v9: [Double] = [v2, v0]
    v1 = v6
    v2 = v1
    let v10: [[Double]] = [v9, v9, v9, v9, v9, v9]
    var v15: Double = v4
    let v33: [Double] = v10[5]
    var v20: Double = v1
    var v40: Double = v15
    let v90: Double = v33[1]
    let v58: Double = v90 + v20
    var v115: Double = v40
    let v192: [Double] = [v58, v115, v0, v58]
    var v216: [Double] = v192
    var v155: [Double] = v216
    var v131: [Double] = v155
    var v110: [Double] = v131
    let v187: Double = v110[3]
    return v187
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    var v8: Double = v1
    let v4: Double = f39(v1)
    let v11: Double = f39(v4)
    let v2: Double = f39(v8)
    let v9: [Double] = [v2, v1, v2, v1, v11]
    let v24: Double = f39(v2)
    v8 = v1
    var v39: [Double] = v9
    let v58: Double = v39[1]
    v39[2] = v24
    return v58
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0]], p3: [[4.0]], p4: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]], p2: [[9.0]], p3: [[10.0]], p4: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]], p2: [[15.0]], p3: [[16.0]], p4: [[17.0]])], p1: [s0(p0: [[18.0]], p1: [[19.0], [20.0]], p2: [[21.0]], p3: [[22.0]], p4: [[23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0]], p2: [[27.0]], p3: [[28.0]], p4: [[29.0]])])], [s1(p0: [s0(p0: [[30.0]], p1: [[31.0], [32.0]], p2: [[33.0]], p3: [[34.0]], p4: [[35.0]]), s0(p0: [[36.0]], p1: [[37.0], [38.0]], p2: [[39.0]], p3: [[40.0]], p4: [[41.0]]), s0(p0: [[42.0]], p1: [[43.0], [44.0]], p2: [[45.0]], p3: [[46.0]], p4: [[47.0]])], p1: [s0(p0: [[48.0]], p1: [[49.0], [50.0]], p2: [[51.0]], p3: [[52.0]], p4: [[53.0]]), s0(p0: [[54.0]], p1: [[55.0], [56.0]], p2: [[57.0]], p3: [[58.0]], p4: [[59.0]])])], [s1(p0: [s0(p0: [[60.0]], p1: [[61.0], [62.0]], p2: [[63.0]], p3: [[64.0]], p4: [[65.0]]), s0(p0: [[66.0]], p1: [[67.0], [68.0]], p2: [[69.0]], p3: [[70.0]], p4: [[71.0]]), s0(p0: [[72.0]], p1: [[73.0], [74.0]], p2: [[75.0]], p3: [[76.0]], p4: [[77.0]])], p1: [s0(p0: [[78.0]], p1: [[79.0], [80.0]], p2: [[81.0]], p3: [[82.0]], p4: [[83.0]]), s0(p0: [[84.0]], p1: [[85.0], [86.0]], p2: [[87.0]], p3: [[88.0]], p4: [[89.0]])])]]
    let v1: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
