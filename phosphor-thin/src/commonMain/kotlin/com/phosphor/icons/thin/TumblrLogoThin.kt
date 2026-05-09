package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.TumblrLogoThin: ImageVector
    get() {
        if (_TumblrLogoThin != null) {
            return _TumblrLogoThin!!
        }
        _TumblrLogoThin = ImageVector.Builder(
            name = "Thin.TumblrLogoThin",
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
                moveTo(192f, 184f)
                verticalLineToRelative(48f)
                horizontalLineTo(152f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                verticalLineTo(112f)
                horizontalLineTo(64f)
                verticalLineTo(72f)
                horizontalLineToRelative(0f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
                horizontalLineToRelative(32f)
                verticalLineTo(72f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                horizontalLineTo(144f)
                verticalLineToRelative(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                close()
            }
        }.build()

        return _TumblrLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _TumblrLogoThin: ImageVector? = null
