package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.GogglesBold: ImageVector
    get() {
        if (_GogglesBold != null) {
            return _GogglesBold!!
        }
        _GogglesBold = ImageVector.Builder(
            name = "Bold.GogglesBold",
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
                moveTo(104f, 152f)
                lineTo(152f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 152f)
                curveToRelative(0f, 17.67f, -30.33f, 32f, -48f, 32f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -64f)
                curveTo(201.67f, 120f, 232f, 134.33f, 232f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 152f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                curveToRelative(-17.67f, 0f, -48f, -14.33f, -48f, -32f)
                reflectiveCurveToRelative(30.33f, -32f, 48f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 152f)
                horizontalLineToRelative(0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
                verticalLineToRelative(-4f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, -64f)
                horizontalLineTo(76f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
                verticalLineToRelative(4f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                horizontalLineToRelative(0f)
            }
        }.build()

        return _GogglesBold!!
    }

@Suppress("ObjectPropertyName")
private var _GogglesBold: ImageVector? = null
