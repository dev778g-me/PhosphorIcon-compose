package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BootBold: ImageVector
    get() {
        if (_BootBold != null) {
            return _BootBold!!
        }
        _BootBold = ImageVector.Builder(
            name = "Bold.BootBold",
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
                moveTo(240f, 164f)
                verticalLineToRelative(36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(205.89f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.58f, -0.84f)
                lineToRelative(-12.62f, -6.32f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.58f, -0.84f)
                horizontalLineTo(169.89f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.58f, 0.84f)
                lineToRelative(-12.62f, 6.32f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.58f, 0.84f)
                horizontalLineTo(121.89f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.58f, -0.84f)
                lineToRelative(-12.62f, -6.32f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.58f, -0.84f)
                horizontalLineTo(85.89f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.58f, 0.84f)
                lineToRelative(-12.62f, 6.32f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.58f, 0.84f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(164f)
                curveToRelative(9.22f, -32.06f, 12f, -84.65f, 0f, -116f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(40f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 164f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(116f, 116f)
                lineTo(152f, 116f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 164f)
                lineTo(240f, 164f)
            }
        }.build()

        return _BootBold!!
    }

@Suppress("ObjectPropertyName")
private var _BootBold: ImageVector? = null
