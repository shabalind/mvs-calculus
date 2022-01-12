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
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s1], _ v2: Double) -> Double {
    var v3: Double = v2
    let v8: s0 = v0[0]
    let v4: [s0] = [v8]
    let v6: s0 = v0[0]
    var v16: Double = v3
    let v18: s0 = v4[0]
    var v12: [s0] = v4
    v12[0] = v18
    let v45: s0 = v12[0]
    let v20: [[Double]] = v45.p1
    let v26: [Double] = v20[2]
    let v36: Double = v26[0]
    v12[0] = v6
    let v88: Double = v36 / v16
    return v88
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0]], p3: [[6.0]]), s0(p0: [[7.0]], p1: [[8.0], [9.0], [10.0]], p2: [[11.0], [12.0]], p3: [[13.0]])]
    let v1: [s1] = [s1(p0: s0(p0: [[14.0]], p1: [[15.0], [16.0], [17.0]], p2: [[18.0], [19.0]], p3: [[20.0]]), p1: s0(p0: [[21.0]], p1: [[22.0], [23.0], [24.0]], p2: [[25.0], [26.0]], p3: [[27.0]])), s1(p0: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]], p2: [[32.0], [33.0]], p3: [[34.0]]), p1: s0(p0: [[35.0]], p1: [[36.0], [37.0], [38.0]], p2: [[39.0], [40.0]], p3: [[41.0]]))]
    let v2: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
