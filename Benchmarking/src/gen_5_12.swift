  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: [[s0]] = v0.p1
    let v6: [s0] = v4[0]
    let v3: s0 = v0.p0
    let v9: s0 = v6[0]
    var v11: s0 = v9
    let v16: [[Double]] = v3.p1
    let v21: [[Double]] = v11.p0
    let v13: [Double] = v16[1]
    let v25: [[Double]] = v11.p0
    let v19: s0 = v0.p0
    var v51: [[Double]] = v16
    var v29: [[Double]] = v51
    let v40: Double = v13[0]
    var v36: [[Double]] = v51
    let v35: [[Double]] = v19.p0
    let v39: [Double] = v29[0]
    let v50: Double = v13[0]
    var v41: [Double] = v13
    v41[0] = v40
    var v44: [Double] = v41
    v11.p1 = v36
    v44 = v39
    let v27: [Double] = v29[2]
    v41[0] = v50
    v36[2] = v39
    let v46: [Double] = v25[1]
    let v97: [Double] = v35[1]
    let v31: Double = v50 * v50
    var v115: [[Double]] = v21
    v11.p1 = v51
    v44 = v97
    v36[0] = v97
    let v126: [Double] = v25[1]
    v29[0] = v44
    let v80: Double = v27[0]
    var v134: Double = v31
    v11.p0 = v115
    let v200: Double = v126[0]
    v134 = v80
    v115[1] = v46
    let v76: Double = v200 * v134
    return v76
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])], [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]])
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
