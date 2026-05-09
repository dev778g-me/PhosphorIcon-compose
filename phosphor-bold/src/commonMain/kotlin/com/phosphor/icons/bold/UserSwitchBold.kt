package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.UserSwitchBold: ImageVector
    get() {
        if (_UserSwitchBold != null) {
            return _UserSwitchBold!!
        }
        _UserSwitchBold = ImageVector.Builder(
            name = "Bold.UserSwitchBold",
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
                moveTo(128f, 120f)
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
                moveTo(204f, 128f)
                lineToRelative(20f, 20f)
                lineToRelative(20f, -20f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 128f)
                lineToRelative(20f, -20f)
                lineToRelative(20f, 20f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 108f)
                verticalLineToRelative(20f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 174f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 148f)
                verticalLineTo(128f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 50f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(66.62f, 201.82f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 122.76f, 0f)
            }
        }.build()

        return _UserSwitchBold!!
    }

@Suppress("ObjectPropertyName")
private var _UserSwitchBold: ImageVector? = null
