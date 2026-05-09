package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DatabaseBold: ImageVector
    get() {
        if (_DatabaseBold != null) {
            return _DatabaseBold!!
        }
        _DatabaseBold = ImageVector.Builder(
            name = "Bold.DatabaseBold",
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
                moveTo(40f, 80f)
                arcToRelative(88f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 176f, 0f)
                arcToRelative(88f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -176f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 80f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 26.51f, 39.4f, 48f, 88f, 48f)
                reflectiveCurveToRelative(88f, -21.49f, 88f, -48f)
                verticalLineTo(80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 128f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 26.51f, 39.4f, 48f, 88f, 48f)
                reflectiveCurveToRelative(88f, -21.49f, 88f, -48f)
                verticalLineTo(128f)
            }
        }.build()

        return _DatabaseBold!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseBold: ImageVector? = null
