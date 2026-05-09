package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.BootThin: ImageVector
    get() {
        if (_BootThin != null) {
            return _BootThin!!
        }
        _BootThin = ImageVector.Builder(
            name = "Thin.BootThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 120f)
                lineTo(112f, 120f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 88f)
                lineTo(112f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 168f)
                verticalLineToRelative(32f)
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
                verticalLineTo(168f)
                curveToRelative(9.22f, -32.06f, 12f, -88.65f, 0f, -120f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(40f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 168f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 168f)
                lineTo(240f, 168f)
            }
        }.build()

        return _BootThin!!
    }

@Suppress("ObjectPropertyName")
private var _BootThin: ImageVector? = null
