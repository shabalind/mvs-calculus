  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: Double
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v5: s1 = v0[0]
    let v4: s1 = v0[2]
    let v8: Double = v4.p1
    let v3: s1 = v0[0]
    let v7: s0 = v3.p0
    let v28: [[Double]] = v7.p0
    let v29: [Double] = v28[1]
    let v23: [[Double]] = v7.p0
    let v33: Double = v5.p1
    let v26: Double = v1 / v8
    var v35: [Double] = v29
    let v42: Double = v26 + v1
    let v19: Double = v35[0]
    v35[0] = v33
    let v30: [Double] = v23[0]
    var v43: [Double] = v29
    let v46: Double = v30[0]
    var v31: Double = v42
    v35[0] = v42
    v31 = v46
    v43[0] = v19
    v43[0] = v46
    let v92: Double = v35[0]
    v35[0] = v19
    v35[0] = v92
    let v82: Double = v43[0]
    v43[0] = v19
    v35[0] = v31
    return v82
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0], [5.0]]), p1: 6.0), s1(p0: s0(p0: [[7.0], [8.0]], p1: [[9.0], [10.0]], p2: [[11.0], [12.0]]), p1: 13.0), s1(p0: s0(p0: [[14.0], [15.0]], p1: [[16.0], [17.0]], p2: [[18.0], [19.0]]), p1: 20.0)]
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
