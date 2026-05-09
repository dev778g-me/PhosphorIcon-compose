package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.BookBookmarkThin: ImageVector
    get() {
        if (_BookBookmarkThin != null) {
            return _BookBookmarkThin!!
        }
        _BookBookmarkThin = ImageVector.Builder(
            name = "Thin.BookBookmarkThin",
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
                moveTo(176f, 32f)
                lineToRelative(0f, 96f)
                lineToRelative(-32.01f, -24f)
                lineToRelative(-31.99f, 24f)
                lineToRelative(0f, -96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                horizontalLineTo(208f)
                verticalLineTo(32f)
                horizontalLineTo(72f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 216f)
                lineToRelative(0f, 8f)
                lineToRelative(144f, 0f)
            }
        }.build()

        return _BookBookmarkThin!!
    }

@Suppress("ObjectPropertyName")
private var _BookBookmarkThin: ImageVector? = null
