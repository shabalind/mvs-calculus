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
  struct s4 {
    var p0: s1
    var p1: s0
  }
  func f43(_ v0: Double) -> Double {
    var v3: Double = v0
    var v8: Double = v0
    var v2: Double = v8
    var v14: Double = v0
    var v6: Double = v3
    var v17: Double = v3
    var v1: Double = v17
    var v15: Double = v1
    var v12: Double = v17
    let v25: [Double] = [v2, v8]
    v3 = v15
    var v20: Double = v12
    var v24: Double = v14
    var v23: [Double] = v25
    var v18: [Double] = v23
    var v22: [Double] = v18
    var v27: Double = v6
    var v37: [Double] = v22
    v23[0] = v20
    var v33: [Double] = v37
    v33[0] = v24
    v37[1] = v27
    let v49: Double = v33[1]
    var v39: Double = v49
    return v39
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    var v7: Double = v1
    v7 = v1
    let v36: Double = f43(v7)
    return v36
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0]], p3: [[4.0], [5.0]], p4: [[6.0]])], p1: [s0(p0: [[7.0]], p1: [[8.0], [9.0]], p2: [[10.0]], p3: [[11.0], [12.0]], p4: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0], [16.0]], p2: [[17.0]], p3: [[18.0], [19.0]], p4: [[20.0]])]), p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]], p2: [[24.0]], p3: [[25.0], [26.0]], p4: [[27.0]]))]
    let v1: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
