package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.LastfmLogo: ImageVector
    get() {
        if (_LastfmLogo != null) {
            return _LastfmLogo!!
        }
        _LastfmLogo = ImageVector.Builder(
            name = "Regular.LastfmLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108.67f, 168f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 192f)
                horizontalLineTo(64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                verticalLineTo(120f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 72f)
                horizontalLineToRelative(9.43f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43.5f, 27.7f)
                lineToRelative(30.14f, 64.6f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 43.5f, 27.7f)
                horizontalLineTo(208f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                horizontalLineToRelative(0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                horizontalLineTo(188f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, -28f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, -28f)
                horizontalLineToRelative(20f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                horizontalLineToRelative(0f)
            }
        }.build()

        return _LastfmLogo!!
    }

@Suppress("ObjectPropertyName")
private var _LastfmLogo: ImageVector? = null
