package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.StickerBold: ImageVector
    get() {
        if (_StickerBold != null) {
            return _StickerBold!!
        }
        _StickerBold = ImageVector.Builder(
            name = "Bold.StickerBold",
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
                moveTo(136f, 216f)
                horizontalLineTo(88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                verticalLineTo(88f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 40f)
                horizontalLineToRelative(80f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                verticalLineToRelative(48f)
                curveTo(208f, 160f, 160f, 208f, 136f, 216f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 216f)
                verticalLineTo(184f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
                horizontalLineToRelative(32f)
            }
        }.build()

        return _StickerBold!!
    }

@Suppress("ObjectPropertyName")
private var _StickerBold: ImageVector? = null
