package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ShieldSlashBold: ImageVector
    get() {
        if (_ShieldSlashBold != null) {
            return _ShieldSlashBold!!
        }
        _ShieldSlashBold = ImageVector.Builder(
            name = "Bold.ShieldSlashBold",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(55.27f, 48f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 96f, 88f, 120f, 88f, 120f)
                reflectiveCurveToRelative(33.59f, -9.16f, 59.27f, -38.81f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208.49f, 157.07f)
                arcTo(131.21f, 131.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 112f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(109.33f)
            }
        }.build()

        return _ShieldSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlashBold: ImageVector? = null
