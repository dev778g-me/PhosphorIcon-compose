package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.InstagramLogoBold: ImageVector
    get() {
        if (_InstagramLogoBold != null) {
            return _InstagramLogoBold!!
        }
        _InstagramLogoBold = ImageVector.Builder(
            name = "Bold.InstagramLogoBold",
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
                moveTo(128f, 128f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 32f)
                lineTo(176f, 32f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 80f)
                lineTo(224f, 176f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 224f)
                lineTo(80f, 224f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 176f)
                lineTo(32f, 80f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(180f, 76f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
        }.build()

        return _InstagramLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _InstagramLogoBold: ImageVector? = null
