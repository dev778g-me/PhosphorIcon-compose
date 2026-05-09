package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PrescriptionBold: ImageVector
    get() {
        if (_PrescriptionBold != null) {
            return _PrescriptionBold!!
        }
        _PrescriptionBold = ImageVector.Builder(
            name = "Bold.PrescriptionBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 128f)
                horizontalLineToRelative(52f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -88f)
                horizontalLineTo(72f)
                verticalLineTo(192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 128f)
                lineTo(200f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 160f)
                lineTo(144f, 216f)
            }
        }.build()

        return _PrescriptionBold!!
    }

@Suppress("ObjectPropertyName")
private var _PrescriptionBold: ImageVector? = null
