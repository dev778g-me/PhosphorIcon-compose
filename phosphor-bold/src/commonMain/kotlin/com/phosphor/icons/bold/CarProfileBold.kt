package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CarProfileBold: ImageVector
    get() {
        if (_CarProfileBold != null) {
            return _CarProfileBold!!
        }
        _CarProfileBold = ImageVector.Builder(
            name = "Bold.CarProfileBold",
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
                moveTo(66f, 178f)
                moveToRelative(-22f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(190f, 178f)
                moveToRelative(-22f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 176f)
                lineTo(168f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(212f, 176f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(208f)
                lineTo(162.34f, 74.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156.69f, 72f)
                horizontalLineTo(48.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.65f, 3.56f)
                lineTo(12f, 120f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(44f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 120f)
                lineTo(12f, 120f)
            }
        }.build()

        return _CarProfileBold!!
    }

@Suppress("ObjectPropertyName")
private var _CarProfileBold: ImageVector? = null
