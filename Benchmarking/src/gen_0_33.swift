  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    let v6: [s3] = v0[0]
    let v2: s3 = v6[0]
    let v10: [s1] = v2.p0
    let v12: s1 = v10[0]
    let v50: [s0] = v12.p1
    let v60: s0 = v50[1]
    let v32: [[Double]] = v60.p1
    let v35: [Double] = v32[1]
    let v46: Double = v35[0]
    var v174: Double = v46
    let v180: Double = v174 - v174
    return v180
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0], [5.0], [6.0]], p3: [[7.0], [8.0], [9.0]], p4: [[10.0], [11.0], [12.0]]), p1: [s0(p0: [[13.0], [14.0]], p1: [[15.0], [16.0]], p2: [[17.0], [18.0], [19.0]], p3: [[20.0], [21.0], [22.0]], p4: [[23.0], [24.0], [25.0]]), s0(p0: [[26.0], [27.0]], p1: [[28.0], [29.0]], p2: [[30.0], [31.0], [32.0]], p3: [[33.0], [34.0], [35.0]], p4: [[36.0], [37.0], [38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0], [42.0]], p2: [[43.0], [44.0], [45.0]], p3: [[46.0], [47.0], [48.0]], p4: [[49.0], [50.0], [51.0]])])], p1: s0(p0: [[52.0], [53.0]], p1: [[54.0], [55.0]], p2: [[56.0], [57.0], [58.0]], p3: [[59.0], [60.0], [61.0]], p4: [[62.0], [63.0], [64.0]]))]]
    let v1: Double = 65.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 65.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
